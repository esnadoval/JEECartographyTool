/**
 * Generated with Acceleo
 */
package CartographyDescription.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

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
public interface PersistenceManagerPropertiesEditionPart {

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
	 * @return the visibility
	 * 
	 */
	public Enumerator getVisibility();

	/**
	 * Init the visibility
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initVisibility(Object input, Enumerator current);

	/**
	 * Defines a new visibility
	 * @param newValue the new visibility to set
	 * 
	 */
	public void setVisibility(Enumerator newValue);




	/**
	 * Init the attributes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAttributes(ReferencesTableSettings settings);

	/**
	 * Update the attributes
	 * @param newValue the attributes to update
	 * 
	 */
	public void updateAttributes();

	/**
	 * Adds the given filter to the attributes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAttributes(ViewerFilter filter);

	/**
	 * Adds the given filter to the attributes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAttributes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the attributes table
	 * 
	 */
	public boolean isContainedInAttributesTable(EObject element);




	/**
	 * Init the methods
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMethods(ReferencesTableSettings settings);

	/**
	 * Update the methods
	 * @param newValue the methods to update
	 * 
	 */
	public void updateMethods();

	/**
	 * Adds the given filter to the methods edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethods(ViewerFilter filter);

	/**
	 * Adds the given filter to the methods edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the methods table
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element);


	/**
	 * @return the inhertance
	 * 
	 */
	public Enumerator getInhertance();

	/**
	 * Init the inhertance
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initInhertance(Object input, Enumerator current);

	/**
	 * Defines a new inhertance
	 * @param newValue the new inhertance to set
	 * 
	 */
	public void setInhertance(Enumerator newValue);




	/**
	 * Init the implements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initImplements_(ReferencesTableSettings settings);

	/**
	 * Update the implements
	 * @param newValue the implements to update
	 * 
	 */
	public void updateImplements_();

	/**
	 * Adds the given filter to the implements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToImplements_(ViewerFilter filter);

	/**
	 * Adds the given filter to the implements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToImplements_(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the implements table
	 * 
	 */
	public boolean isContainedInImplements_Table(EObject element);


	/**
	 * @return the originalFileName
	 * 
	 */
	public String getOriginalFileName();

	/**
	 * Defines a new originalFileName
	 * @param newValue the new originalFileName to set
	 * 
	 */
	public void setOriginalFileName(String newValue);


	/**
	 * @return the persistenceType
	 * 
	 */
	public String getPersistenceType();

	/**
	 * Defines a new persistenceType
	 * @param newValue the new persistenceType to set
	 * 
	 */
	public void setPersistenceType(String newValue);





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
