package mds;

import java.util.ArrayList;
import java.util.List;

public class NodeGroup {
	
	
	//This class will be used for identifying and tracking nodes
	//Ultimate unique IDs are needed
	
	ArrayList<Integer> IDList = new ArrayList<>();
	private String name = "DEFAULT NAME";
	public NodeGroup(String n)
	{
		name = n;
	}
	
	public void AddToNG(int id)
	{
		IDList.add(id);
	}
	
	public void ListIDNumbers()
	{
		System.out.println("IDs in this group");
		for (int i = 0; i < IDList.size(); i++)
		{
			System.out.print(IDList.get(i) + " ");
		}
	}
	
	public String GetName()
	{
		return name;
	}
	public int GetCount()
	{
		return IDList.size();
	}
}
