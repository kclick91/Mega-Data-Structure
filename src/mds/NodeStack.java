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
		System.out.println("Node with message: ");
		n.PrintMessage();
		System.out.println("was added to the stack.");
	}

	public void ReadNodeFromStack()
	{
		System.out.println("Message from TOP of stack: ");
		stack.peek().PrintMessage();
	}
	public void RemoveNodeFromStack()
	{
		System.out.println("Top of stack has been removed.");
		stack.pop();
		System.out.println("Now: ");
		this.ReadNodeFromStack();
	}
}
