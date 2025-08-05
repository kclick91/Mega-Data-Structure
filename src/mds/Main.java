package mds;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Mega Data Structure!");
		
		NodeGroupCollective ngc = new NodeGroupCollective();
		
		//Show Groups --> Show nodes in Group
		NodeGroup ngGENERAL = new NodeGroup("GENERAL NODE GROUP");
		ngc.AddNG(ngGENERAL);
		
		List<Node> list = new ArrayList<>();
		
		
		
		Node n = new Node("Start Node", 1);
		ngGENERAL.AddToNG(1);
		
		
		
		Node nTwo = new Node("Neighbor of Start Node", 2);
		ngGENERAL.AddToNG(2);
		list.add(nTwo);
		
		
		
		Graph graph = new Graph(n, "Graph One");
		
		n.StartGraph(list, graph);
		
	
		Node start = graph.GetStartNode().GetNodesNextDoor().get(0);
		System.out.println("start id is: " + start.GetID());
		Node nThree = new Node("Start Node for Graph Two", 3);
		ngGENERAL.AddToNG(3);
		Node nFour = new Node("Graph Two", 4);
		ngGENERAL.AddToNG(4);
		Node nFive = new Node("Graph Two", 5);
		ngGENERAL.AddToNG(5);
		Node nSix = new Node("Graph Two", 6);
		ngGENERAL.AddToNG(6);
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
		ngGENERAL.AddToNG(7);
		Node nodeEight = new Node("Secondary Graph Node", 8);
		ngGENERAL.AddToNG(8);
		
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
		
		// EXPERIMENTING WITH//
		//
		//
		//
		NodeGroup ngPLU = new NodeGroup("Nodes grouped for plumbing.");
		ngc.AddNG(ngPLU);
		Node startNodePlumbing = new Node("Plumbing Basics/Fundamentals", 1);
		ngPLU.AddToNG(1);
		Graph plumbingStart = new Graph(startNodePlumbing, "Starter Graph");
				
		List<Node> nodesListPlumbing = new ArrayList<>();
				
		Node topicOne = new Node("Understanding what plumbing covers", 2);
		ngPLU.AddToNG(2);
		Node topicTwo = new Node("Learn the basics first", 3);
		ngPLU.AddToNG(3);
		Node topicThree = new Node("Practice hands-on", 4);
		ngPLU.AddToNG(4);
		Node topicFour = new Node("Take a beginner course", 5);
		ngPLU.AddToNG(5);
		Node topicFive = new Node("Learn the code", 6);
		ngPLU.AddToNG(6);
		Node topicSix = new Node("Join Forums or Communities", 7);
		ngPLU.AddToNG(7);
		Node topicSeven = new Node("Explore Certification(If going pro)", 8);
		ngPLU.AddToNG(8);
		Node topicEight = new Node("Starter Tool List", 9);
		ngPLU.AddToNG(9);
		
		
		
		
		
		
		
		nodesListPlumbing.add(topicOne);
		nodesListPlumbing.add(topicTwo);
		nodesListPlumbing.add(topicThree);
		nodesListPlumbing.add(topicFour);
		nodesListPlumbing.add(topicFive);
		nodesListPlumbing.add(topicSix);
		nodesListPlumbing.add(topicSeven);
		nodesListPlumbing.add(topicEight);
	
		SecondaryGraph sgToolList = new SecondaryGraph(topicEight, "Tool List Graph");
		
		List<Node> nodesTools = new ArrayList<>();
		
		Node toolOne = new Node("Pipe wrench(large & small)", 100);
		ngPLU.AddToNG(100);
		Node toolTwo = new Node("Adjustable Wrench", 101);
		ngPLU.AddToNG(101);
		Node toolThree = new Node("Basin wrench", 102);
		ngPLU.AddToNG(102);
		Node toolFour = new Node("Pipe cutter(copper and PVC)", 103);
		ngPLU.AddToNG(103);
		Node toolFive = new Node("Plumber's Torch(for soldering copper)", 104);
		ngPLU.AddToNG(104);
		Node toolSix = new Node("Tape measure", 105);
		ngPLU.AddToNG(105);
		Node toolSeven = new Node("Plunger & auger(drain snake)", 106);
		ngPLU.AddToNG(106);
		Node toolEight = new Node("Pipe threader or tap/die set", 107);
		ngPLU.AddToNG(107);
		Node toolNine = new Node("Channel-lock pliers", 108);
		ngPLU.AddToNG(108);
		Node toolTen = new Node("Teflon Tape(PTFE)", 109);
		ngPLU.AddToNG(109);
		Node toolEleven = new Node("Pipe dope (sealant)", 110);
		ngPLU.AddToNG(110);
		Node toolTwelve = new Node("Level", 111);
		ngPLU.AddToNG(111);
		Node toolThirteen = new Node("Hacksaw", 112);
		ngPLU.AddToNG(112);
		Node toolFourteen = new Node("Bucket & rags", 113);
		ngPLU.AddToNG(113);
		Node toolFifteen = new Node("Safety gloves & goggles", 114);
		ngPLU.AddToNG(114);
		topicEight.AddToGraph(toolOne);
		topicEight.AddToGraph(toolTwo);
		topicEight.AddToGraph(toolThree);
		topicEight.AddToGraph(toolFour);
		topicEight.AddToGraph(toolFive);
		topicEight.AddToGraph(toolSix);
		topicEight.AddToGraph(toolSeven);
		topicEight.AddToGraph(toolEight);
		topicEight.AddToGraph(toolNine);
		topicEight.AddToGraph(toolTen);
		topicEight.AddToGraph(toolEleven);
		topicEight.AddToGraph(toolTwelve);
		topicEight.AddToGraph(toolThirteen);
		topicEight.AddToGraph(toolFourteen);
		topicEight.AddToGraph(toolFifteen);
		
		Node toolList = sgToolList.GetStartNode();
		
		startNodePlumbing.StartGraph(nodesListPlumbing, plumbingStart);
				
		startNodePlumbing.PrintNeighbors();

		toolList.PrintMessage();
		//Tool list neighbors
		toolList.PrintNeighbors();
		
	
		NodeStack nsLearnObtainTools = new NodeStack();
		
		
		
		nsLearnObtainTools.AddNodeToStack(toolThree);
		nsLearnObtainTools.AddNodeToStack(toolTwo);
		nsLearnObtainTools.AddNodeToStack(toolOne);
		nsLearnObtainTools.AddNodeToStack(toolThirteen);
		nsLearnObtainTools.AddNodeToStack(toolFifteen);
		
		nsLearnObtainTools.ReadNodeFromStack();
		nsLearnObtainTools.RemoveNodeFromStack();
		nsLearnObtainTools.ReadNodeFromStack();
		
		
		ngc.ListNG();
		
		ngc.ListGroupsWithID(1);
		
		
		Menu();
		
		
		
		
		
	}
	public static void Menu()
	{
		//MENU IN PROGRESS
		
		System.out.println("MDS MENU");
		System.out.println("1. Create A Graph");
		System.out.println("2. Create A Secondary Graph");
		System.out.println("3. Add Node to Stack");
		System.out.println("4. Add Node to Queue");
		System.out.println("5. Remove Node from Stack");
		System.out.println("6. Remove Node from Queue");
		System.out.println("7. Add Node to Node Group");
		System.out.println("8. Remove Node from Node Group");
		System.out.println("9. Create a new Node");
		System.out.println("10. Show Graphs");
		System.out.println("11. Show Stacks");
		System.out.println("12. Show Queues");
		System.out.println("13. Show Groups");
		System.out.println("14. Activity");
		
		System.out.println("Enter in number found in menu.");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		System.out.println("You picked: " + i);
		System.out.println("IMPLEMENTATION OF THE MENU IS COMING SOON!");
		
		
		Menu();
	}
	

}
