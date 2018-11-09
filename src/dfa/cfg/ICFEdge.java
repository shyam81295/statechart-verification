package cfg;

public interface ICFEdge {
	public ICFGNode getHead(); //target node					//
	public ICFGNode getTail(); //source node					//
	public void setHead(ICFGNode node); //target node			//
	public void setTail(ICFGNode node); //source node			//
	public ICFG getCFG();										//
	public void setCFG(ICFG graph);								//
	public void setEdgeAnnotation(boolean bool);
	public boolean getEdgeAnnotation();
	public String getId();										//
}
