package mds;

import java.util.ArrayList;
import java.util.List;

public class NodeGroupCollective {
	
	private List<NodeGroup> ngColl;
	
	public NodeGroupCollective()
	{
		ngColl = new ArrayList<NodeGroup>();
	}
	
	public void AddNG(NodeGroup ng)
	{
		ngColl.add(ng);
	}
	
	public void ListNG()
	{
		System.out.println("List of all groups.");
		for (int i = 0; i < ngColl.size(); i++)
		{
			System.out.print(i + 1 + ". ");
			System.out.println(ngColl.get(i).GetName());
		}
	}
	
	//LIST GROUPS WHERE ID IS IN GROUP
	public void ListGroupsWithID(int id)
	{
		for (int j = 0; j < ngColl.size(); j++)
		{
			for (int k= 0; k < ngColl.get(j).GetCount();k++)
			{
				if (ngColl.get(j).IDList.get(k) == id)
				{
					System.out.println("FOUND IN " + ngColl.get(j).GetName());
				}
				break;
			}
		}
	}
	
	
}
