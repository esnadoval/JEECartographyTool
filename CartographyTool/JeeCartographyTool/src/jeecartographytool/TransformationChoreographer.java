package jeecartographytool;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.swt.widgets.Monitor;

import jeecartographytool.defops.RelationResolver;
import jeecartographytool.defops.TierResolver;
import jeecartographytool.defops.WeightingResolver;
import jeecartographytool.extensions.IModelHeuristic;
import CartographyDescription.Application;
import CartographyDescription.RelationType;

public class TransformationChoreographer {

	private ArrayList<IModelHeuristic> heuristicsClasses;
	private CartographyModelParser cartographyParser;
	private ArrayList<File> originalFiles;
	
	public TransformationChoreographer(Model modiscoRoot, String appName,ArrayList<IModelHeuristic> heuristicsClasses,ArrayList<File>originalFiles){	
		this.originalFiles = originalFiles;
		
		cartographyParser = new CartographyModelParser(modiscoRoot, appName,originalFiles);
		
	
		this.heuristicsClasses = heuristicsClasses;
			
	}
	public Application excuteCartographyOperations(IProgressMonitor monitor){
		
		cartographyParser.parseApplication();
		
		heuristicExecution(monitor);
				
		return cartographyParser.getCartoRootModel();
	}
	
	private void heuristicExecution(IProgressMonitor monitor) {

		for (IModelHeuristic mpp : heuristicsClasses) {
			System.out.println("-> Post-Processing: "
					+ mpp.getHeuristicName());
			
			mpp.setParams(new Object[]{cartographyParser.getClassesMap(),originalFiles});
			monitor.setTaskName("Executing " + mpp.getHeuristicName() + "...");
			monitor.worked(1);
			mpp.resolveHeuristic(cartographyParser.getCartoRootModel());
			
			
		}
	}
	
}
