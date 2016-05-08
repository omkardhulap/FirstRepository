//Collections:SET
package collection;
/**
*
* @author Kavya_Ramakrishna
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(200);
		set.add(300);
		set.add(100);
        set.add(400);
        set.add(100);//duplicate not allowed:will not display
        set.add(500);

		Iterator<Integer> iterator = set.iterator();

		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
	}
}

