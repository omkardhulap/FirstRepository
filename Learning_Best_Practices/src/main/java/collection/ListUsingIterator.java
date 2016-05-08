//Collection:List using Iterator

package collection;
/**
*
* @author Kavya_Ramakrishna
*/

//package com.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListUsingIterator
{
	public static void main(String []args)
	{

		List<String> list = new ArrayList<String>();

		list.add("ABC");
		list.add("PQR");
		list.add("XYZ");
                list.add("ABC");
        //using FOR
		for (String element : list)
		{
			System.out.println(element);
		}

        //Using Iterator
                System.out.println();
		ListIterator<String> object = list.listIterator();

		while(object.hasNext())
        {
			System.out.println(object.next());  
		}
	}
}
