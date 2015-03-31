package org.elipse.papyrus.diagramdrawer.util;

import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.elipse.papyrus.diagramdrawer.DiagramType;
import org.elipse.papyrus.diagramdrawer.PapyrusDiagram;
import org.elipse.papyrus.diagramdrawer.exception.DiagramNotFoundException;

/**
 * Provides methods to create, load or delete a diagram
 * @author rakotoarivony
 *
 */
public class DiagramFactory {
	private ModelSet modelSet;
	
	public DiagramFactory(ModelSet modelSet){
		this.modelSet = modelSet;
	}
	
	/**
	 * Returns a new papyrus diagram with the type and name given in parameters
	 * @param type The type of diagram. To see which type of diagram can be created, see the doc of <link>DiagramType</link>
	 * @param diagramName The name of the diagram which will be created
	 * @return a new papyrus diagram
	 */
	public PapyrusDiagram create(DiagramType type,String diagramName){
		//TODO
		return null;		
	}
	
	/**
	 * Returns the diagram with the given name
	 * @param diagramName The name of the diagram
	 * @return a new papyrus diagram
	 */
	public PapyrusDiagram load(String diagramName) {
		return null;
	}
	

	/**
	 * Deletes the diagram with the given name in the modelSet referenced by this factory
	 * @param diagramName the name of the diagram
	 * @throws DiagramNotFoundException if the diagram cannot be found into the model set referenced by this factory
	 */
	public void delete(String diagramName) throws DiagramNotFoundException{
		
	}
	
	/**
	 * Deletes the diagram with the given name in the model set referenced by this factory
	 * @param diagramName the diagram to be deleted from the model set
	 * @throws DiagramNotFoundException if the diagram does not exists in the model set referenced by this factory
	 */
	public void delete(PapyrusDiagram diagram) throws DiagramNotFoundException{
		
	}
	
}
