/**
 * Generated with Acceleo
 */
package CartographyDescription.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface VariablePropertiesEditionPart {

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
	 * @return the static
	 * 
	 */
	public Boolean getStatic_();

	/**
	 * Defines a new static
	 * @param newValue the new static to set
	 * 
	 */
	public void setStatic_(Boolean newValue);





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
