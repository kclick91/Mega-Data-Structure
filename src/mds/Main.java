package mds;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Mega Data Structure!");
		
		
		List<Node> list = new ArrayList<>();
		
		
		
		Node n = new Node("Start Node");
		
		Node nTwo = new Node("Neighbor of Start Node");
		list.add(nTwo);
		
		
		
		Graph graph = new Graph(n, "Graph One");
		
		n.StartGraph(list, graph);
		
	
		Node start = graph.GetStartNode().GetNodesNextDoor().get(0);
		
		Node nThree = new Node("Start Node for Graph Two");
		Node nFour = new Node("Graph Two");
		Node nFive = new Node("Graph Two");
		Node nSix = new Node("Graph Two");
		List<Node> listTwo = new ArrayList<>();
		listTwo.add(nFour);
		listTwo.add(nFive);
		listTwo.add(nSix);
		
	    
		Graph graphTwo = new Graph(nThree, "Graph Two");
		nThree.StartGraph(listTwo, graphTwo);
		Node startGraphTwo = graphTwo.GetStartNode().GetNodesNextDoor().get(0);
		Node startGraphTwoTwo = graphTwo.GetStartNode().GetNodesNextDoor().get(1);
		Node startGraphTwoThree = graphTwo.GetStartNode().GetNodesNextDoor().get(2);
		Node nodeSeven = new Node("Secondary Graph Node");
		Node nodeEight = new Node("Secondary Graph Node");
		
		List<Node> listThree = new ArrayList<>();
		listThree.add(nodeSeven);
		listThree.add(nodeEight);
		
		SecondaryGraph sgOne = new SecondaryGraph(nFour, "Secondary Graph One");
		nFour.StartGraph(listThree, sgOne);
		Node nodeSG = nFour.GetNodesNextDoor().get(0);
		Node nodeSGTwo = nFour.GetNodesNextDoor().get(1);
		
		//Node Eight back to Node One
		List<Node> loopPart = new ArrayList<Node>();
		loopPart.add(n);
		Graph loopGraphPart = new Graph(nodeEight,"Loop");
		nodeEight.StartGraph(loopPart, loopGraphPart);
		
		Node or = loopGraphPart.GetStartNode();
		
		System.out.println("Start Node should be a neighbor: ");
		or.PrintNeighbors();
		
		
	}

}
