package jeecartographytool.defops;

import CartographyDescription.Application;
import CartographyDescription.Class;
import jeecartographytool.extensions.IModelHeuristic;

public class WeightingResolver implements IModelHeuristic {

	@Override
	public Boolean resolveHeuristic(Application root) {
		int maxWeight = 0;
		int weight = 0;
		for (Class cls : root.getCompilationUnits()) {
			cls.setWeight(cls.getMigRelations().size());
			cls.setMaxWeight(cls.getMigRelations().size());
			
			if(cls.getMigRelations().size() > maxWeight){
				maxWeight = cls.getMigRelations().size();
				weight += cls.getMigRelations().size();
			}
		}
		
		root.setMaxWeight(maxWeight);
		root.setWeight(weight);
		
		return false;
	}

	@Override
	public String getHeuristicName() {
		// TODO Auto-generated method stub
		return "Default Weighting Metrics.";
	}

	@Override
	public String getHeuristicDescription() {
		// TODO Auto-generated method stub
		return "Defines for each class a weight number based on the quantity of outgoing relations.";
	}

	@Override
	public void setParams(Object[] params) {
		// TODO Auto-generated method stub
		
	}

}
