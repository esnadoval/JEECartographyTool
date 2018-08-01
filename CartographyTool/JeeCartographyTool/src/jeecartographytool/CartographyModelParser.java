package jeecartographytool;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import jeecartographytool.extensions.IModelStereoTyper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;
import org.eclipse.gmt.modisco.java.EnumDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NullLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.emf.impl.EnumConstantDeclarationImpl;
import org.eclipse.jdt.core.search.SearchEngine;

import CartographyDescription.AnnotationParameter;
import CartographyDescription.Application;
import CartographyDescription.Attribute;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.Class;
import CartographyDescription.Constructor;
import CartographyDescription.EnumLiteral;
import CartographyDescription.EnumLiteralvalue;
import CartographyDescription.Exception;
import CartographyDescription.Inhertance;
import CartographyDescription.Interface;
import CartographyDescription.Method;
import CartographyDescription.VarType;
import CartographyDescription.Variable;
import CartographyDescription.Visibility;

public class CartographyModelParser {

	public static final int BUSSINES_TYPE = 1;
	public static final int ENTITY_TYPE = 2;
	public static final int SERVICE_TYPE = 3;
	public static final int TEST_TYPE = 4;
	public static final int UI_TYPE = 5;
	public static final int PERSISTENCEMAN_TYPE = 6;

	private Model modiscoJavaModel;
	private Application cartoRootModel;
	private String name;
	private CartographyDescriptionFactory cartModelFactory = CartographyDescriptionFactory.eINSTANCE;
	private HashMap<String, Class> classesMap = new HashMap<String, Class>();
	private HashMap<String, File> originalFiles = new HashMap<String, File>();
	private IModelStereoTyper stereoTyper;

	public HashMap<String, Class> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(HashMap<String, Class> classesMap) {
		this.classesMap = classesMap;
	}

	public CartographyModelParser(Model moroot, String appName, ArrayList<File> fls, IModelStereoTyper stereotyper) {
		modiscoJavaModel = moroot;
		this.name = appName;
		this.stereoTyper = stereotyper;

		for (File file : fls) {
			// System.out.println("PFL>" + file.getName());
			originalFiles.put(file.getName(), file);
		}

	}

	public Application getCartoRootModel() {
		return cartoRootModel;
	}

	public void setCartoRootModel(Application cartoRootModel) {
		this.cartoRootModel = cartoRootModel;
	}

	public Application parseApplication() {

		Application app = cartModelFactory.createApplication();
		app.setName(name);
		cartoRootModel = app;
		ArrayList<CartographyDescription.Class> clases = new ArrayList<Class>();
		/*
		 * for (Package pckg : modiscoJavaModel.getOwnedElements()) {
		 * searchForClassesOnPackages(clases, pckg, ""); }
		 */
		for (CompilationUnit pckg : modiscoJavaModel.getCompilationUnits()) {
			searchForElementsOnCompilationUnits(clases, pckg, "");
		}

		return app;

	}

	private void searchForElementsOnCompilationUnits(ArrayList<CartographyDescription.Class> classes, CompilationUnit actual, String packageStr) {

		if (actual.getTypes().isEmpty()) {
			System.out.println("CU>" + actual.getName() + " - " + actual.getTypes().size());
			InterfaceDeclaration cd = org.eclipse.gmt.modisco.java.emf.JavaFactory.eINSTANCE.createInterfaceDeclaration();
			cd.setName(actual.getName().substring(0, actual.getName().length() - 5));
			cd.setOriginalCompilationUnit(actual);
			classesMap.put(actual.getName(), createClass(null, cd, null));
			System.out.println("CRT");
		} else {
			for (int i = 0; i < actual.getTypes().size(); i++) {

				if (actual.getTypes().get(i).eClass().getName().equals("ClassDeclaration")) {
					classesMap.put(actual.getTypes().get(i).getName(), createClass((ClassDeclaration) actual.getTypes().get(i), null, null));
				} else if (actual.getTypes().get(i).eClass().getName().equals("InterfaceDeclaration")) {
					classesMap.put(actual.getTypes().get(i).getName(), createClass(null, (InterfaceDeclaration) actual.getTypes().get(i), null));
				} else if (actual.getTypes().get(i).eClass().getName().equals("EnumDeclaration")) {

					classesMap.put(actual.getTypes().get(i).getName(), createClass(null, null, (EnumDeclaration) actual.getTypes().get(i)));
				}
			}
		}

	}

	public CartographyDescription.Class createClass(ClassDeclaration mclass, InterfaceDeclaration mint, EnumDeclaration edec) {
		for (CartographyDescription.Class cls : cartoRootModel.getCompilationUnits()) {
			if (mint == null && edec == null) {
				if (mclass.getName().toLowerCase().equals(cls.getName().toLowerCase())) {
					return cls;
				}
			} else if (mclass == null && mint == null) {
				if (edec.getName().toLowerCase().equals(cls.getName().toLowerCase())) {
					return cls;
				}

			} else {

				if (mint.getName().toLowerCase().equals(cls.getName().toLowerCase())) {
					return cls;
				}

			}

		}
		CartographyDescription.Class ncl = null;
		if (mint == null && edec == null) {
			ncl = parseClass(mclass);
		} else if (mint == null && mclass == null) {
			ncl = parseEnumeration(edec);
		} else {
			ncl = parseInterface(mint);

		}
		cartoRootModel.getCompilationUnits().add(ncl);
		return ncl;
	}

	public CartographyDescription.Class parseInterface(InterfaceDeclaration mint) {

		CartographyDescription.Class nclass = cartModelFactory.createInterface();

		nclass.setName(mint.getName());
		nclass.setOriginalFileName(mint.getOriginalCompilationUnit().getName());

		nclass.setOriginalFilePath(originalFiles.get(mint.getOriginalCompilationUnit().getName()).getAbsolutePath());
		if (mint.getModifier() != null) {
			nclass.setInhertance(Inhertance.get(mint.getModifier().getInheritance().getValue()));
			nclass.setVisibility(Visibility.get(mint.getModifier().getVisibility().getValue()));
		}

		for (BodyDeclaration body : mint.getBodyDeclarations()) {
			if (body.eClass().getName().equals("MethodDeclaration")) {
				nclass.getMethods().add(parseMethod((MethodDeclaration) body));
			}
		}

		for (Annotation anot : mint.getAnnotations()) {
			nclass.getAnotations().add(parseAnnotation(anot));
		}
		for (TypeAccess imp : mint.getSuperInterfaces()) {

			VarType vt = cartModelFactory.createVarType();

			vt.setName(imp.getType().getName());

			nclass.getImplements().add(vt);
		}
		// nclass.setModiscoClassDeclaration(mclass.);
		return nclass;

	}

	public CartographyDescription.Class parseClass(ClassDeclaration mclass) {

		CartographyDescription.Class nclass;

		switch (getClassType(mclass)) {
		case BUSSINES_TYPE:
			nclass = cartModelFactory.createBussiness();
			break;

		case PERSISTENCEMAN_TYPE:
			nclass = cartModelFactory.createPersistenceManager();
			break;
		case UI_TYPE:
			nclass = cartModelFactory.createUI();
			break;
		case ENTITY_TYPE:
			nclass = cartModelFactory.createEntity();
			break;
		case TEST_TYPE:
			nclass = cartModelFactory.createUnitTest();
			break;
		case SERVICE_TYPE:
			nclass = cartModelFactory.createService();
			break;
		default:
			nclass = cartModelFactory.createClass();
			break;
		}

		nclass.setName(mclass.getName());

		nclass.setOriginalFileName(mclass.getOriginalCompilationUnit().getName());
		nclass.setOriginalFilePath(originalFiles.get(mclass.getOriginalCompilationUnit().getName()).getAbsolutePath());
		if (mclass.getModifier() != null) {
			nclass.setInhertance(Inhertance.get(mclass.getModifier().getInheritance().getValue()));
			nclass.setVisibility(Visibility.get(mclass.getModifier().getVisibility().getValue()));
		}

		for (BodyDeclaration body : mclass.getBodyDeclarations()) {
			if (body.eClass().getName().equals("FieldDeclaration")) {
				nclass.getAttributes().add(parseAtributte((FieldDeclaration) body));
			} else if (body.eClass().getName().equals("MethodDeclaration")) {
				nclass.getMethods().add(parseMethod((MethodDeclaration) body));
			} else if (body.eClass().getName().equals("ConstructorDeclaration")) {
				nclass.getMethods().add(parseConstructor((ConstructorDeclaration) body));
			}
		}

		for (Annotation anot : mclass.getAnnotations()) {
			nclass.getAnotations().add(parseAnnotation(anot));
		}

		for (TypeAccess imp : mclass.getSuperInterfaces()) {

			VarType vt = cartModelFactory.createVarType();

			vt.setName(imp.getType().getName());

			nclass.getImplements().add(vt);
		}

		if (mclass.getSuperClass() != null) {
			VarType vt = cartModelFactory.createVarType();

			vt.setName(mclass.getSuperClass().getType().getName());

			nclass.setExtends(vt);
		}
		// nclass.setModiscoClassDeclaration(mclass.);
		return nclass;

	}

	public CartographyDescription.Enumeration parseEnumeration(EnumDeclaration menum) {

		CartographyDescription.Enumeration nenum = cartModelFactory.createEnumeration();

		nenum.setName(menum.getName());

		nenum.setOriginalFileName(menum.getOriginalCompilationUnit().getName());
		nenum.setOriginalFilePath(originalFiles.get(menum.getOriginalCompilationUnit().getName()).getAbsolutePath());
		if (menum.getModifier() != null) {
			nenum.setInhertance(Inhertance.get(menum.getModifier().getInheritance().getValue()));
			nenum.setVisibility(Visibility.get(menum.getModifier().getVisibility().getValue()));
		}

		Constructor refConstructor = null;

		for (BodyDeclaration body : menum.getBodyDeclarations()) {
			if (body.eClass().getName().equals("FieldDeclaration")) {
				nenum.getAttributes().add(parseAtributte((FieldDeclaration) body));
			} else if (body.eClass().getName().equals("MethodDeclaration")) {
				nenum.getMethods().add(parseMethod((MethodDeclaration) body));
			} else if (body.eClass().getName().equals("ConstructorDeclaration")) {
				refConstructor = parseConstructor((ConstructorDeclaration) body);
				nenum.getMethods().add(refConstructor);
			}
		}

		for (Annotation anot : menum.getAnnotations()) {
			nenum.getAnotations().add(parseAnnotation(anot));
		}

		for (TypeAccess imp : menum.getSuperInterfaces()) {

			VarType vt = cartModelFactory.createVarType();

			vt.setName(imp.getType().getName());

			nenum.getImplements().add(vt);
		}

		for (EnumConstantDeclaration en : menum.getEnumConstants()) {
			EnumLiteral lit = cartModelFactory.createEnumLiteral();

			lit.setName(en.getName());
			int cidx = 0;
			for (Expression argument : en.getArguments()) {

				EnumLiteralvalue lval = cartModelFactory.createEnumLiteralvalue();

				if (refConstructor.getParameters().size() == en.getArguments().size()) {

					Variable varg = refConstructor.getParameters().get(cidx);

					lval.setAttr(varg);
				}

				if (argument instanceof NumberLiteral) {

					lval.setValue(((NumberLiteral) argument).getTokenValue());

				} else if (argument instanceof StringLiteral) {

					lval.setValue(((StringLiteral) argument).getEscapedValue());

				} else if (argument instanceof TypeLiteral) {

					lval.setValue(((TypeLiteral) argument).getType().getType().getName());
				} else if (argument instanceof SingleVariableAccess) {
					
					CompilationUnit cup = ((SingleVariableAccess) argument).getVariable().getOriginalCompilationUnit();
					
					String staticIdentifier = null;
					if(cup != null){
						if(cup.getName().split(".java").length > 0){
							staticIdentifier = cup.getName().split(".java")[0];
						}
					}
					
					lval.setValue((staticIdentifier!= null?staticIdentifier+".":"")+((SingleVariableAccess) argument).getVariable().getName());
				} else if (argument instanceof BooleanLiteral) {

					lval.setValue(""+((BooleanLiteral) argument).isValue());
					
				} else if (argument instanceof NullLiteral) {

					lval.setValue("null");
					
				} else {
					lval.setValue(argument.toString());
				}

				lit.getValues().add(lval);
				cidx++;
			}

			nenum.getLiterals().add(lit);
		}
		return nenum;

	}

	public Attribute parseAtributte(FieldDeclaration fld) {

		Attribute attr = cartModelFactory.createAttribute();

		Variable var = cartModelFactory.createVariable();

		if (fld.getFragments().size() > 0) {
			var.setName(fld.getFragments().get(0).getName());

		}

		if (fld.getType() != null) {
			VarType vt = cartModelFactory.createVarType();
			vt.setName(fld.getType().getType().getName());
			var.setType(vt);
		}

		if (fld.getModifier() != null) {
			var.setInhertance(Inhertance.get(fld.getModifier().getInheritance().getValue()));
			var.setStatic(fld.getModifier().isStatic());
			attr.setVisibility(Visibility.get(fld.getModifier().getVisibility().getValue()));
		}

		for (Annotation anot : fld.getAnnotations()) {
			attr.getAnotations().add(parseAnnotation(anot));
		}

		attr.setVariable(var);

		return attr;

	}

	public CartographyDescription.Annotation parseAnnotation(Annotation modanot) {

		CartographyDescription.Annotation nAnot = cartModelFactory.createAnnotation();

		nAnot.setName(modanot.getType().getType().getName());

		for (AnnotationMemberValuePair pars : modanot.getValues()) {
			AnnotationParameter ap = cartModelFactory.createAnnotationParameter();
			if (pars.getValue() != null) {
				if (pars.getValue().eClass().getName().equals("UnresolvedItemAccess")) {
					UnresolvedItemAccess uia = ((UnresolvedItemAccess) pars.getValue());
					ap.setValue(uia.getElement().getName());
					if (uia.getQualifier() != null) {
						if (uia.getQualifier().eClass().getName().equals("UnresolvedItemAccess")) {
							ap.setName(((UnresolvedItemAccess) uia.getQualifier()).getElement().getName());
						}
					}

				}
			}

			nAnot.getParams().add(ap);
		}

		return nAnot;
	}

	public Method parseMethod(MethodDeclaration md) {

		Method mth = cartModelFactory.createMethod();
		mth.setName(md.getName());
		/*
		 * if(md.getBody() != null){ Iterator<EObject> ti =
		 * md.getBody().eAllContents(); String container = "";
		 * while(ti.hasNext()){ EObject ob = ti.next(); container += ob. + "\n";
		 * }
		 * 
		 * mth.setCode(container);
		 * 
		 * }
		 */
		if (md.getModifier() != null) {
			mth.setInhertance(Inhertance.get(md.getModifier().getInheritance().getValue()));
			mth.setVisibility(Visibility.get(md.getModifier().getVisibility().getValue()));
		}

		for (TypeAccess exep : md.getThrownExceptions()) {

			Exception exc = cartModelFactory.createException();

			exc.setName(exep.getType().getName());
		}

		for (SingleVariableDeclaration params : md.getParameters()) {

			Variable vr = cartModelFactory.createVariable();

			vr.setName(params.getName());
			VarType vt = cartModelFactory.createVarType();
			vt.setName(params.getType().getType().getName());
			vr.setType(vt);
			if (params.getModifier() != null) {
				vr.setInhertance(Inhertance.get(params.getModifier().getInheritance().getValue()));
			}

			mth.getParameters().add(vr);
		}
		if (md.getReturnType() != null) {

			VarType vt = cartModelFactory.createVarType();
			vt.setName(md.getReturnType().getType().getName());
			mth.setReturnType(vt);
		}

		for (Annotation anot : md.getAnnotations()) {
			mth.getAnotations().add(parseAnnotation(anot));
		}

		return mth;
	}

	public Constructor parseConstructor(ConstructorDeclaration md) {

		Constructor mth = cartModelFactory.createConstructor();
		mth.setName(md.getName());
		/*
		 * if(md.getBody() != null){ Iterator<EObject> ti =
		 * md.getBody().eAllContents(); String container = "";
		 * while(ti.hasNext()){ EObject ob = ti.next(); container += ob. + "\n";
		 * }
		 * 
		 * mth.setCode(container);
		 * 
		 * }
		 */
		if (md.getModifier() != null) {
			mth.setInhertance(Inhertance.get(md.getModifier().getInheritance().getValue()));
			mth.setVisibility(Visibility.get(md.getModifier().getVisibility().getValue()));
		}

		for (TypeAccess exep : md.getThrownExceptions()) {

			Exception exc = cartModelFactory.createException();

			exc.setName(exep.getType().getName());
		}

		for (SingleVariableDeclaration params : md.getParameters()) {

			Variable vr = cartModelFactory.createVariable();

			vr.setName(params.getName());
			VarType vt = cartModelFactory.createVarType();
			vt.setName(params.getType().getType().getName());
			vr.setType(vt);
			if (params.getModifier() != null) {
				vr.setInhertance(Inhertance.get(params.getModifier().getInheritance().getValue()));
			}

			mth.getParameters().add(vr);
		}

		for (Annotation anot : md.getAnnotations()) {
			mth.getAnotations().add(parseAnnotation(anot));
		}

		return mth;
	}

	private int getClassType(ClassDeclaration mclass) {

		return stereoTyper.getStereoType(mclass);
	}

}
