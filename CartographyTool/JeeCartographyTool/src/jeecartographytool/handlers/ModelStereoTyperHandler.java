package jeecartographytool.handlers;

import java.util.ArrayList;

import jeecartographytool.extensions.IModelHeuristic;
import jeecartographytool.extensions.IModelStereoTyper;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.gmt.modisco.java.Model;

import CartographyDescription.Application;

public class ModelStereoTyperHandler {
	private static final String EXTENSION_ID = "jeecartographytool.stereotypers";

	private ArrayList<IModelStereoTyper> postProcessingClasess = new ArrayList<IModelStereoTyper>();

	public ModelStereoTyperHandler() {
		
	}

	public ArrayList<IModelStereoTyper> evaluate(IExtensionRegistry registry) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(EXTENSION_ID);
		try {
			for (IConfigurationElement e : config) {
				System.out.println("Evaluating extension");
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IModelStereoTyper) {
					postProcessingClasess.add((IModelStereoTyper) o);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
		return postProcessingClasess;
	}


}