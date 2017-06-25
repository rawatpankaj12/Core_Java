package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class B 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(123);
		list.add(134);
		list.add(567);
		//list.add("pankaj");
		list.add(90);
		list.add(67);
		System.out.println(list.get(3));
		System.out.println("BEFOR SORTING");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("AFTER SORTING");
		System.out.println(list);

	}

}
