package mds;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Mega Data Structure!");
		
		
		List<Node> list = new ArrayList<>();
		
		
		
		Node n = new Node("Start Node", 1);
		
		Node nTwo = new Node("Neighbor of Start Node", 2);
		list.add(nTwo);
		
		
		
		Graph graph = new Graph(n, "Graph One");
		
		n.StartGraph(list, graph);
		
	
		Node start = graph.GetStartNode().GetNodesNextDoor().get(0);
		
		Node nThree = new Node("Start Node for Graph Two", 3);
		Node nFour = new Node("Graph Two", 4);
		Node nFive = new Node("Graph Two", 5);
		Node nSix = new Node("Graph Two", 6);
		List<Node> listTwo = new ArrayList<>();
		listTwo.add(nFour);
		listTwo.add(nFive);
		listTwo.add(nSix);
		
	    
		Graph graphTwo = new Graph(nThree, "Graph Two");
		nThree.StartGraph(listTwo, graphTwo);
		Node startGraphTwo = graphTwo.GetStartNode().GetNodesNextDoor().get(0);
		Node startGraphTwoTwo = graphTwo.GetStartNode().GetNodesNextDoor().get(1);
		Node startGraphTwoThree = graphTwo.GetStartNode().GetNodesNextDoor().get(2);
		Node nodeSeven = new Node("Secondary Graph Node", 7);
		Node nodeEight = new Node("Secondary Graph Node", 8);
		
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
		
		//BREAK
		System.out.println("===================");
		System.out.println("Message of start node of loop part: ");
		or.PrintMessage();
		System.out.println("Message of first neighbor: ");
		or.GetNodesNextDoor().get(0).PrintMessage();
		System.out.println("Message of first neighbor of the first neighbor: ");
		or.GetNodesNextDoor().get(0).GetNodesNextDoor().get(0).PrintMessage();
		
		//Stack Examples
		NodeStack ns = new NodeStack();
		
		ns.AddNodeToStack(nTwo);
		ns.AddNodeToStack(nThree);
		ns.AddNodeToStack(nFour);
		
		ns.ReadNodeFromStack();
		ns.RemoveNodeFromStack();
		ns.ReadNodeFromStack();
		
		NodeGroup ng = new NodeGroup("ID of Nodes used in Stack.");
		ng.AddToNG(nTwo.GetID());
		ng.AddToNG(nThree.GetID());
		ng.AddToNG(nFour.GetID());

		ng.ListIDNumbers();
	
		
		System.out.println("Node Queue");
		NodeQueue nq = new NodeQueue();
		nq.AddToQueue(nTwo);
		nq.AddToQueue(nThree);
		nq.AddToQueue(nFour);
		
		nq.ReadFromQueue();
		nq.RemoveFromQueue();
		nq.ReadFromQueue();
		
		Node nodeFromRead = nq.ReturnNodeFromRead();
		System.out.println(nodeFromRead.GetID());
		
	}

}
