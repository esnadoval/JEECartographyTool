package jeecartographytool.handlers;


import java.util.ArrayList;







import jeecartographytool.extensions.IModelHeuristic;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.gmt.modisco.java.Model;

import CartographyDescription.Application;





public class ModelHeuristicsHandler {
  private static final String EXTENSION_ID = 
      "jeecartographytool.heuristics";

  private Application model;
  
  private ArrayList<IModelHeuristic> postProcessingClasess = new ArrayList<IModelHeuristic>(); 
  
  public ModelHeuristicsHandler(Application model) {
	this.model = model;
 }
 
    
  public ArrayList<IModelHeuristic> evaluate(IExtensionRegistry registry) {
    IConfigurationElement[] config =
        registry.getConfigurationElementsFor(EXTENSION_ID);
    try {
      for (IConfigurationElement e : config) {
        System.out.println("Evaluating extension");
        final Object o =
            e.createExecutableExtension("class");
        if (o instanceof IModelHeuristic) {
          postProcessingClasess.add((IModelHeuristic) o);
        }
      }
    } catch (CoreException ex) {
      System.out.println(ex.getMessage());
    }
    return postProcessingClasess;
  }

  public void executeExtension(final Object o) {
    ISafeRunnable runnable = new ISafeRunnable() {
      @Override
      public void handleException(Throwable e) {
        System.out.println("Exception in client");
      }

      @Override
      public void run() throws Exception {
        ((IModelHeuristic) o).resolveHeuristic(model);
      }
    };
    SafeRunner.run(runnable);
  }
} 