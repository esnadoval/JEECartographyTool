/**
 * Generated with Acceleo
 */
package CartographyDescription.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ElementRelationPropertiesEditionPart {

	/**
	 * @return the src
	 * 
	 */
	public EObject getSrc();

	/**
	 * Init the src
	 * @param settings the combo setting
	 */
	public void initSrc(EObjectFlatComboSettings settings);

	/**
	 * Defines a new src
	 * @param newValue the new src to set
	 * 
	 */
	public void setSrc(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSrcButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the src edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSrc(ViewerFilter filter);

	/**
	 * Adds the given filter to the src edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSrc(ViewerFilter filter);


	/**
	 * @return the dest
	 * 
	 */
	public EObject getDest();

	/**
	 * Init the dest
	 * @param settings the combo setting
	 */
	public void initDest(EObjectFlatComboSettings settings);

	/**
	 * Defines a new dest
	 * @param newValue the new dest to set
	 * 
	 */
	public void setDest(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDestButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the dest edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDest(ViewerFilter filter);

	/**
	 * Adds the given filter to the dest edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDest(ViewerFilter filter);


	/**
	 * @return the relationType
	 * 
	 */
	public Enumerator getRelationType();

	/**
	 * Init the relationType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initRelationType(Object input, Enumerator current);

	/**
	 * Defines a new relationType
	 * @param newValue the new relationType to set
	 * 
	 */
	public void setRelationType(Enumerator newValue);





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
