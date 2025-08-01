package mds;

import java.util.Stack;

public class NodeStack {
	Stack<Node> stack = new Stack<>();
	
	public NodeStack()
	{
		System.out.println("A stack of nodes has been created.");
	}
	
	public void AddNodeToStack(Node n)
	{
		stack.push(n);
	}

	public void ReadNodeFromStack()
	{
		System.out.println("Message from top of stack: ");
		stack.peek().PrintMessage();
	}
	public void RemoveNodeFromStack()
	{
		stack.pop();
	}
}
