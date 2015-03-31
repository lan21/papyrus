package org.elipse.papyrus.diagramdrawer;

/**
 * Is the type of diagram
 * @author rakotoarivony
 *
 */
public enum DiagramType {
	Activity,
	Class,
	Communication,
	Component,
	Composite,
	Deployment,
	Sequence,
	StateMachine,
	Timing,
	UseCase;
//	InnerClass,
//	Package,
	
	public String getClassCommand() {		
		return "org.eclipse.papyrus.uml.diagram."+this.toLower()+".Create"+this.toString()+"DiagramCommand";
	}
	
	
	private String toLower() {		
		String ret = this.toString().toLowerCase();
		if (("class").equals(ret))
			return "clazz";
		if (("timing").equals(ret))
			return "timing.custom";
		else
			return ret;
	}
}
