package jeecartographytool.defops;

import java.util.HashMap;

import org.eclipse.gmt.modisco.java.ClassDeclaration;

import CartographyDescription.Application;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Layer;
import CartographyDescription.Pattern;
import CartographyDescription.RelationType;
import jeecartographytool.extensions.IModelHeuristic;

public class TierResolver implements IModelHeuristic {

	public static final int BUSSINES_LAYER = 1;
	public static final int UI_LAYER = 2;
	public static final int PERSISTENCE_LAYER = 3;
	public static final int COMMON_LAYER = 4;
	public static final int SERVICE_LAYER = 5;
	public static final int TEST_LAYER = 6;

	private HashMap<String, Layer> paterns = new HashMap<String, Layer>();
	private CartographyDescriptionFactory cartModelFactory = CartographyDescriptionFactory.eINSTANCE;
	private Application root;

	@Override
	public Boolean resolveHeuristic(Application root) {
		// TODO Auto-generated method stub
		this.root = root;
		Layer itf = cartModelFactory.createLayer();
		itf.setName("Logic");
		paterns.put("Logic", itf);

		Layer ui = cartModelFactory.createLayer();
		ui.setName("UserInterface");
		paterns.put("UI", ui);

		Layer persist = cartModelFactory.createLayer();
		persist.setName("Persistence");
		paterns.put("Per", persist);

		Layer common = cartModelFactory.createLayer();
		common.setName("Common/Utils");
		paterns.put("utl", common);

		Layer service = cartModelFactory.createLayer();
		service.setName("Services");
		paterns.put("svc", service);

		Layer test = cartModelFactory.createLayer();
		test.setName("Test");
		paterns.put("tst", test);

		for (Class cls : root.getCompilationUnits()) {
			addClassToTier(cls, true);
		}

		root.getLayers().add(itf);
		root.getLayers().add(ui);
		root.getLayers().add(persist);
		root.getLayers().add(common);
		root.getLayers().add(service);
		root.getLayers().add(test);

		return false;
	}

	@Override
	public String getHeuristicName() {
		// TODO Auto-generated method stub
		return "Default Class Layerer.";
	}

	@Override
	public String getHeuristicDescription() {
		// TODO Auto-generated method stub
		return "Clasifies all the application Classes into the common Jee Layers (User Interface, Service, Logic, Persistence, Common).";
	}

	@Override
	public void setParams(Object[] params) {
		// TODO Auto-generated method stub

	}

	private int addClassToTier(CartographyDescription.Class mclass, boolean add) {
		if (mclass.eClass().getName().equals("Entity")
				|| mclass.eClass().getName().equals("PersistenceManager")) {
			if (add) {
				paterns.get("Per").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("Per"));
			}
			return PERSISTENCE_LAYER;
		} else if (mclass.eClass().getName().equals("Bussiness")) {
			if (add) {
				paterns.get("Logic").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("Logic"));
			}
			return BUSSINES_LAYER;
		} else if (mclass.eClass().getName().equals("Service")) {
			if (add) {
				paterns.get("svc").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("svc"));
			}
			return SERVICE_LAYER;
		} else if (mclass.eClass().getName().equals("Class")) {
			if (add) {
				paterns.get("utl").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("utl"));
			}
			return COMMON_LAYER;
		} else if (mclass.eClass().getName().equals("UI")) {
			if (add) {
				paterns.get("UI").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("UI"));
			}
			return UI_LAYER;
		} else if (mclass.eClass().getName().equals("UnitTest")) {
			if (add) {
				paterns.get("tst").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("tst"));
			}
			return TEST_LAYER;
		} else if (mclass.eClass().getName().equals("Interface") && add) {

			boolean found = false;
			for (ElementRelation elrel : root.getAppRelations()) {
				if (elrel.getDest().getName().equals(mclass.getName())
						&& elrel.getRelationType().getValue() == RelationType.IMPLEMENTS_VALUE) {
					found = true;
					switch (addClassToTier((Class) elrel.getSrc(), false)) {
					case PERSISTENCE_LAYER:
						paterns.get("Per").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("Per"));
						break;
					case BUSSINES_LAYER:
						paterns.get("Logic").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("Logic"));
						break;
					case SERVICE_LAYER:
						paterns.get("svc").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("svc"));
						break;
					case COMMON_LAYER:
						paterns.get("utl").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("utl"));
						break;
					case UI_LAYER:
						paterns.get("UI").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("UI"));
						break;
					case TEST_LAYER:
						paterns.get("tst").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("tst"));
						break;
					default:
						paterns.get("utl").getCompilationUnits().add(mclass);
						mclass.setParentLayer(paterns.get("utl"));
						break;
					}

				}
			}
			if(!found){
				paterns.get("utl").getCompilationUnits().add(mclass);
				mclass.setParentLayer(paterns.get("utl"));
				
			}
		}
		return 0;

	}
}
