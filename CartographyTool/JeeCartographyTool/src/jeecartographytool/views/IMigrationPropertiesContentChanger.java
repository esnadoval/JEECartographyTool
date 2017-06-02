package jeecartographytool.views;

import org.eclipse.emf.ecore.EObject;

import CartographyDescription.Module;

public interface IMigrationPropertiesContentChanger {

	public void refreshModuleContent(Module fg);
	public void refreshClassContent(CartographyDescription.Class so);
	public void refreshGeneric(EObject co);
}
