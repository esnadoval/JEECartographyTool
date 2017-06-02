/**
 * Generated with Acceleo
 */
package CartographyDescription.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface LayerPropertiesEditionPart {

	/**
	 * @return the locs
	 * 
	 */
	public String getLocs();

	/**
	 * Defines a new locs
	 * @param newValue the new locs to set
	 * 
	 */
	public void setLocs(String newValue);


	/**
	 * @return the comments
	 * 
	 */
	public String getComments();

	/**
	 * Defines a new comments
	 * @param newValue the new comments to set
	 * 
	 */
	public void setComments(String newValue);




	/**
	 * Init the anotations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnotations(ReferencesTableSettings settings);

	/**
	 * Update the anotations
	 * @param newValue the anotations to update
	 * 
	 */
	public void updateAnotations();

	/**
	 * Adds the given filter to the anotations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnotations(ViewerFilter filter);

	/**
	 * Adds the given filter to the anotations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the anotations table
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element);


	/**
	 * @return the weight
	 * 
	 */
	public String getWeight();

	/**
	 * Defines a new weight
	 * @param newValue the new weight to set
	 * 
	 */
	public void setWeight(String newValue);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the maxWeight
	 * 
	 */
	public String getMaxWeight();

	/**
	 * Defines a new maxWeight
	 * @param newValue the new maxWeight to set
	 * 
	 */
	public void setMaxWeight(String newValue);




	/**
	 * Init the migRelations
	 * @param settings settings for the migRelations ReferencesTable 
	 */
	public void initMigRelations(ReferencesTableSettings settings);

	/**
	 * Update the migRelations
	 * @param newValue the migRelations to update
	 * 
	 */
	public void updateMigRelations();

	/**
	 * Adds the given filter to the migRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter);

	/**
	 * Adds the given filter to the migRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the migRelations table
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element);


	/**
	 * @return the parentLayer
	 * 
	 */
	public EObject getParentLayer();

	/**
	 * Init the parentLayer
	 * @param settings the combo setting
	 */
	public void initParentLayer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentLayer
	 * @param newValue the new parentLayer to set
	 * 
	 */
	public void setParentLayer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentLayer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentLayer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter);


	/**
	 * @return the parentModule
	 * 
	 */
	public EObject getParentModule();

	/**
	 * Init the parentModule
	 * @param settings the combo setting
	 */
	public void initParentModule(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentModule
	 * @param newValue the new parentModule to set
	 * 
	 */
	public void setParentModule(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentModule edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentModule edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter);


	/**
	 * @return the originalFilePath
	 * 
	 */
	public String getOriginalFilePath();

	/**
	 * Defines a new originalFilePath
	 * @param newValue the new originalFilePath to set
	 * 
	 */
	public void setOriginalFilePath(String newValue);


	/**
	 * @return the newFilePath
	 * 
	 */
	public String getNewFilePath();

	/**
	 * Defines a new newFilePath
	 * @param newValue the new newFilePath to set
	 * 
	 */
	public void setNewFilePath(String newValue);




	/**
	 * Init the compilationUnits
	 * @param settings settings for the compilationUnits ReferencesTable 
	 */
	public void initCompilationUnits(ReferencesTableSettings settings);

	/**
	 * Update the compilationUnits
	 * @param newValue the compilationUnits to update
	 * 
	 */
	public void updateCompilationUnits();

	/**
	 * Adds the given filter to the compilationUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCompilationUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the compilationUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCompilationUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the compilationUnits table
	 * 
	 */
	public boolean isContainedInCompilationUnitsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
