package jeecartographytool.utils;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import CartographyDescription.Application;
import CartographyDescription.Bussiness;
import CartographyDescription.Entity;
import CartographyDescription.Interface;
import CartographyDescription.PersistenceManager;
import CartographyDescription.Service;
import CartographyDescription.UI;
import CartographyDescription.UnitTest;

public class ModelUtils {

	public static Application loadModel(IFile loadFile) {

		System.out.println("LDFL>"
				+ loadFile.getLocation().makeAbsolute().toString());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(
				URI.createURI(loadFile.getLocationURI().toString()), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		return (Application) resource.getContents().get(0);

	}

	public static void saveModel(Application mod, IFile saveFile)
			throws Exception {
		FileOutputStream foutcrt = new FileOutputStream(saveFile.getLocation()
				.makeAbsolute().toFile());

		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resourcecrt = resSet.createResource(URI.createURI(saveFile
				.getLocation().makeAbsolute().toString()));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resourcecrt.getContents().add(mod);

		resourcecrt.save(foutcrt, null);
	}

	public static ArrayList<Class> getCompilationTypes() {
		ArrayList<Class> clss = new ArrayList<Class>();

		clss.add(CartographyDescription.Class.class);

		clss.add(Entity.class);
		clss.add(Interface.class);

		clss.add(PersistenceManager.class);

		clss.add(Bussiness.class);

		clss.add(Service.class);

		clss.add(UnitTest.class);

		clss.add(UI.class);

		return clss;

	}

	public static boolean isValidSourceCode(EObject eObject) {
		if (eObject instanceof CartographyDescription.Class) {
			return true;
		} else if (eObject instanceof Entity) {
			return true;
		} else if (eObject instanceof Interface) {
			return true;
		} else if (eObject instanceof PersistenceManager) {
			return true;
		} else if (eObject instanceof Bussiness) {
			return true;
		} else if (eObject instanceof Service) {
			return true;
		} else if (eObject instanceof UnitTest) {
			return true;
		} else if (eObject instanceof UI) {
			return true;
		}
		return false;
	}
}
