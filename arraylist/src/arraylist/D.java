package arraylist;

import java.util.ArrayList;

public class D 
{

	public static void main(String[] args)
	{
		boolean status=false;
		ArrayList list=new ArrayList();
		list.add(123);
		list.add(23);
		list.add(456);
		list.add(44);
		System.out.println(list);
		
		Integer i1=null;
		for(int i=0;i<list.size();i++)
		{
			i1=(Integer)list.get(i);
			if(i1==65)
			{
				status=true;
			}
		}
		if(status)
		{
			System.out.println("THIS DATA IS AVAILABLE");
		}
		else
		{
			System.out.println("NOT");
		}

	}

}
