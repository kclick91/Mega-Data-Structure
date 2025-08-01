package mds;

import java.util.List;

public class Node {
	
	public List<Node> nodesNextDoor;
	private String message;
	private Graph graph;
	private int ID;
	public Node(String m, int id)
	{
		message = m;
		ID = id;
	}

	public Node(List<Node> nodes, String m, int id)
	{
		nodesNextDoor = nodes;
		message = m;
		ID = id;
	}
	
	public List<Node> StartGraph(List<Node> nodes, Graph g)
	{
		nodesNextDoor = nodes;
		graph = g;
		System.out.println(GetCount((nodes)));
		PrintNeighbors();
		return nodesNextDoor;
	}
	
	
	public void AddToGraph(Node n)
	{
		nodesNextDoor.add(n);
	}
	
	public List<Node> GetNodesNextDoor()
	{
		return nodesNextDoor;
	}
	
	public void PrintMessage()
	{
		System.out.println(message);
	}
	
	public String GetCount(List<Node> n)
	{
		return n.size() + " neighbor(s) was/were just added to start node of " + "Graph: " + graph.GetName();
	}
	public void PrintNeighbors()
	{
		for (int i = 0; i < nodesNextDoor.size(); i++)
		{
			nodesNextDoor.get(i).PrintMessage();
		}
	}
	public int GetID()
	{
		return ID;
	}
}
