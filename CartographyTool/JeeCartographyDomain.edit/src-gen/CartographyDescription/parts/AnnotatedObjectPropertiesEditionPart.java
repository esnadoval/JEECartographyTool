/**
 * Generated with Acceleo
 */
package CartographyDescription.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface AnnotatedObjectPropertiesEditionPart {



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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
