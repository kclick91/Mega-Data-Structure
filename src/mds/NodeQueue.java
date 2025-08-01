package mds;

import java.util.LinkedList;
import java.util.Queue;

public class NodeQueue {
	
	Queue<Node> nodeQueue;
	public NodeQueue()
	{
		nodeQueue = new LinkedList<>();	
		
	}
	
	public void AddToQueue(Node n)
	{
		nodeQueue.add(n);
	}
	
	public void ReadFromQueue()
	{
		nodeQueue.peek().PrintMessage();
		System.out.println(nodeQueue.peek().GetID());
	}
	
	public Node ReturnNodeFromRead()
	{
		Node n = nodeQueue.peek();
		return n;
	}
	
	public void RemoveFromQueue()
	{
		nodeQueue.remove();
	}

}
