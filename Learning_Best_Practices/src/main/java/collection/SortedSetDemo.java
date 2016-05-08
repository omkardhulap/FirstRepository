//Collections:SortedSet

package collection;
/**
*
* @author Kavya_Ramakrishna
*/

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo
{

	public static void main(String[] args) 
	{

		SortedSet<Integer> set = new TreeSet<Integer>();

		set.add(200);
		set.add(300);
		set.add(100);
        set.add(400);
		Iterator<Integer> iterator = set.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
