package org.elipse.papyrus.diagramdrawer.util;

import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.elipse.papyrus.diagramdrawer.exception.ModelSetNotFoundException;

/**
 * Provides methods to create or to delete a ModelSet by its name
 * @author rakotoarivony
 *
 */
public class ModelSetFactory {
	/**
	 * Returns a new ModelSet named with the given <i>modelSetName<i>
	 * @param modelSetName the name a the new model
	 * @return a new ModelSet 
	 */
	public ModelSet create(String modelSetName){
		//TODO
		return null;
	}
	
	/**
	 * Retrieves and returns the ModelSet which is named <i>modelSetName<i>
	 * @param modelSetName the name of the model
	 * @return the model set
	 * @throws ModelSetNotFoundException if the model set does not exist
	 */
	public ModelSet load(String modelSetName) throws ModelSetNotFoundException{
		//TODO
		return null;
	}
}
