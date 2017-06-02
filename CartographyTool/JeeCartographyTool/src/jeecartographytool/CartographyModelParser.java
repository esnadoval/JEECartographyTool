package jeecartographytool;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;











import CartographyDescription.AnnotationParameter;
import CartographyDescription.Application;
import CartographyDescription.Attribute;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.Class;
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
	private HashMap<String,Class> classesMap = new HashMap<String, Class>();
	private HashMap<String,File> originalFiles = new HashMap<String, File>();
	
	
	public HashMap<String, Class> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(HashMap<String, Class> classesMap) {
		this.classesMap = classesMap;
	}

	public CartographyModelParser(Model moroot, String appName, ArrayList<File> fls){
		modiscoJavaModel = moroot;
		this.name = appName;
		
		for (File file : fls) {
			System.out.println("PFL>" + file.getName());
			originalFiles.put(file.getName(), file);
		}
		
	}
	
	public Application getCartoRootModel() {
		return cartoRootModel;
	}

	public void setCartoRootModel(Application cartoRootModel) {
		this.cartoRootModel = cartoRootModel;
	}

	public Application parseApplication(){
		
		
		Application app = cartModelFactory.createApplication();
		app.setName(name);
		cartoRootModel = app;
		ArrayList<CartographyDescription.Class> clases = new ArrayList<Class>();
		for (Package pckg : modiscoJavaModel.getOwnedElements()) {
			searchForClassesOnPackages(clases, pckg, "");
		}

		
		return app;
		
	}
	
	
	private void searchForClassesOnPackages(ArrayList<CartographyDescription.Class> classes, Package actual, String packageStr){
		
		for (int i = 0; i <actual.getOwnedElements().size(); i++) {
		
			if(actual.getOwnedElements().get(i).eClass().getName().equals("ClassDeclaration")){
				classesMap.put(actual.getOwnedElements().get(i).getName(),createClass((ClassDeclaration) actual.getOwnedElements().get(i),null));
			}else if(actual.getOwnedElements().get(i).eClass().getName().equals("InterfaceDeclaration")){
				classesMap.put(actual.getOwnedElements().get(i).getName(),createClass(null,(InterfaceDeclaration) actual.getOwnedElements().get(i)));
			}
		}
		for (Package pckg : actual.getOwnedPackages()) {
			searchForClassesOnPackages(classes, pckg, packageStr);
		}
		
	}
	
	public CartographyDescription.Class createClass(ClassDeclaration mclass, InterfaceDeclaration mint){
		for (CartographyDescription.Class cls : cartoRootModel.getCompilationUnits()) {
			if(mint == null){
				if(mclass.getName().toLowerCase().equals(cls.getName().toLowerCase())){
					return cls;
				}
			}else{
				if(mint.getName().toLowerCase().equals(cls.getName().toLowerCase())){
					return cls;
				}
				
			}
			
		}
		CartographyDescription.Class ncl = null;
		if(mint == null){
			ncl = parseClass(mclass);
		}else{
			ncl = parseInterface(mint);
			
		}
		cartoRootModel.getCompilationUnits().add(ncl);
		return ncl;
	}
	
public CartographyDescription.Class parseInterface(InterfaceDeclaration mint){
		
		CartographyDescription.Class nclass = cartModelFactory.createInterface();
		
		
		nclass.setName(mint.getName());
		nclass.setOriginalFileName(mint.getOriginalCompilationUnit().getName());
		
		nclass.setOriginalFilePath(originalFiles.get(mint.getOriginalCompilationUnit().getName()).getAbsolutePath());
		if(mint.getModifier()!= null){
			nclass.setInhertance(Inhertance.get(mint.getModifier().getInheritance().getValue()));
			nclass.setVisibility(Visibility.get(mint.getModifier().getVisibility().getValue()));
		}
		
		for (BodyDeclaration body : mint.getBodyDeclarations()) {
			if(body.eClass().getName().equals("MethodDeclaration")){
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
		//nclass.setModiscoClassDeclaration(mclass.);
		return nclass;
		
	}
	
	
	
	public CartographyDescription.Class parseClass(ClassDeclaration mclass){
		
		CartographyDescription.Class nclass;
		switch (getClassType(mclass)) {
		case BUSSINES_TYPE:
			nclass= cartModelFactory.createBussiness();
			break;

		case PERSISTENCEMAN_TYPE:
			nclass= cartModelFactory.createPersistenceManager();
			break;
		case UI_TYPE:
			nclass= cartModelFactory.createUI();	
				break;
		case ENTITY_TYPE:
			nclass= cartModelFactory.createEntity();
			break;
		case TEST_TYPE:
			nclass= cartModelFactory.createUnitTest();
			break;
		case SERVICE_TYPE:
			nclass= cartModelFactory.createService();
			break;
		default:
			nclass= cartModelFactory.createClass();
			break;
		}
		
		nclass.setName(mclass.getName());
		nclass.setOriginalFileName(mclass.getOriginalCompilationUnit().getName());
		nclass.setOriginalFilePath(originalFiles.get(mclass.getOriginalCompilationUnit().getName()).getAbsolutePath());
		if(mclass.getModifier()!= null){
			nclass.setInhertance(Inhertance.get(mclass.getModifier().getInheritance().getValue()));
			nclass.setVisibility(Visibility.get(mclass.getModifier().getVisibility().getValue()));
		}
		
		for (BodyDeclaration body : mclass.getBodyDeclarations()) {
			if(body.eClass().getName().equals("FieldDeclaration")){
				nclass.getAttributes().add(parseAtributte((FieldDeclaration) body));
			}else if(body.eClass().getName().equals("MethodDeclaration")){
				nclass.getMethods().add(parseMethod((MethodDeclaration) body));
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
		
		if(mclass.getSuperClass() != null){
			VarType vt = cartModelFactory.createVarType();
			
			vt.setName(mclass.getSuperClass().getType().getName());
			
			nclass.setExtends(vt);
		}
		//nclass.setModiscoClassDeclaration(mclass.);
		return nclass;
		
	}
	
	
	
	public Attribute parseAtributte(FieldDeclaration fld){
		
		Attribute attr = cartModelFactory.createAttribute();
		
		Variable var = cartModelFactory.createVariable();
		
		
		if(fld.getFragments().size() > 0){
			var.setName(fld.getFragments().get(0).getName());
			
		}
		
		
		if(fld.getType() != null){
			VarType vt = cartModelFactory.createVarType();
			vt.setName(fld.getType().getType().getName());
			var.setType(vt);
		}
		
		if(fld.getModifier()!= null){
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
	
	public CartographyDescription.Annotation parseAnnotation(Annotation modanot){
		
		CartographyDescription.Annotation nAnot = cartModelFactory.createAnnotation();
		
		nAnot.setName(modanot.getType().getType().getName());
		
		
		for (AnnotationMemberValuePair pars : modanot.getValues()) {
			AnnotationParameter ap = cartModelFactory.createAnnotationParameter();
			if(pars.getValue() != null){
			if(pars.getValue().eClass().getName().equals("UnresolvedItemAccess")){
				UnresolvedItemAccess uia = ((UnresolvedItemAccess)pars.getValue());
				ap.setValue(uia.getElement().getName());
				if(uia.getQualifier() != null){
					if(uia.eClass().getName().equals("UnresolvedItemAccess")){
						ap.setName(((UnresolvedItemAccess)uia.getQualifier()).getElement().getName());
					}
				}
				
			}
			}
			
			nAnot.getParams().add(ap);
		}
		
		return nAnot;
	}
	
	
	
	public Method parseMethod(MethodDeclaration md){
		
		Method mth = cartModelFactory.createMethod();
		mth.setName(md.getName());
		
		if(md.getModifier()!= null){
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
			if(params.getModifier() != null){
			vr.setInhertance(Inhertance.get(params.getModifier().getInheritance().getValue()));
			}
			
			mth.getParameters().add(vr);
		}
		if(md.getReturnType() != null){
			
			VarType vt = cartModelFactory.createVarType();
			vt.setName(md.getReturnType().getType().getName());
			mth.setReturnType(vt);
		}
		
		for (Annotation anot : md.getAnnotations()) {
			mth.getAnotations().add(parseAnnotation(anot));
		}

		return mth;
	}
	
	
	private int getClassType(ClassDeclaration mclass){
		
		
	
		
		if(searchForAnotationInClass(mclass,"entity")){
			return ENTITY_TYPE;
		}else if(searchForAnotationInClass(mclass,"persistencecontext")){
			return PERSISTENCEMAN_TYPE;
		}else if(searchForAnotationInClass(mclass,"mangedbean")){
			return UI_TYPE;
		}else if(searchForAnotationInClass(mclass,"messagebean")){
			return BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"post")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"get")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"webservice")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"delete")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"entitymanager")){
			return PERSISTENCEMAN_TYPE;
		}else if(searchForAnotationInClass(mclass,"webservice")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"produces")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"consumes")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"path")){
			return SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"stateless")){
			return BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"stateful")){
			return BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"singleton")){
			return BUSSINES_TYPE;
		}
		else if(searchForAnotationInClass(mclass,"test")){
			return TEST_TYPE;
		}
		
		if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*bean[A-za-z0-9.]*")){
			return BUSSINES_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*facade[A-za-z0-9.]*")){
			return UI_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*bo[A-za-z0-9.]*")){
			return ENTITY_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*dao[A-za-z0-9.]*")){
			return PERSISTENCEMAN_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*service[A-za-z0-9.]*")){
			return SERVICE_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9]+'test'")){
			return TEST_TYPE;
		}
		
		
		
		
		
		return 0;
	}
	
	
	
	private boolean searchForAnotationInClass(ClassDeclaration elem,String anotn){
		for (Annotation anot : elem.getAnnotations()) {
			if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
				return true;
		
			}
		}
		
		for (BodyDeclaration bddec : elem.getBodyDeclarations()) {
			for (Annotation anot : bddec.getAnnotations()) {
				if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
			if(bddec.eClass().getName().equals("VariableDeclaration")){
				if(((FieldDeclaration)bddec).getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
			
		}
		
		
		return false;
	}
	
	private boolean searchForAnotationInInterface(InterfaceDeclaration elem,String anotn){
		for (Annotation anot : elem.getAnnotations()) {
			if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
				return true;
		
			}
		}
		
		for (BodyDeclaration bddec : elem.getBodyDeclarations()) {
			for (Annotation anot : bddec.getAnnotations()) {
				if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
		}
		
		
		return false;
	}
	

	}
