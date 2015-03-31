package org.elipse.papyrus.diagramdrawer.util;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.elipse.papyrus.diagramdrawer.exception.ElementDeleteException;

/**
 * Provides methods to do some actions like deletion or creation of an element into a model
 * @author rakotoarivony
 *
 */

public class UMLModelHelper {

	private Model UMLModel;
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param UMLModel
	 */
	public UMLModelHelper(Model UMLModel){
		this.UMLModel = UMLModel;
	}
	
	/**
	 * Deletes an element on the model referenced of this helper
	 * @param element the element to delete
	 * @throws Exception
	 */
	public void delete(Element element) throws ElementDeleteException{
		//TODO
	}
}
