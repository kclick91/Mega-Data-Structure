package mds;

public class Graph {

	private Node startNode;
	private String name;
	
	
	public Graph(Node sN, String n)
	{
		startNode = sN;
		name = n;
		
	}
	
	public Node GetStartNode()
	{
		return startNode;
	}
	
	public String GetName()
	{
		return name;
	}
	
}
