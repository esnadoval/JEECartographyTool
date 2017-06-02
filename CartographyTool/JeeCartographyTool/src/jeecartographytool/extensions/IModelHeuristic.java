package jeecartographytool.extensions;

import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Model;

import CartographyDescription.Application;


public interface IModelHeuristic {

	/**
	 * Método que se ejecuta después de haber generado el modelo de la aplicación.
	 * Si devuelve verdadero es porque se sobreescribe el agrupamiento por defecto
	 * (Algoritmo Edge Betweenes).
	 * 
	 * @param model
	 * @return
	 */
	public Boolean resolveHeuristic(Application root);
	public String getHeuristicName();
	public String getHeuristicDescription();
	public void setParams(Object[] params);
}
