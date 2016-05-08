//ListDemo

package collection;
/**
*
* @author Kavya_Ramakrishna
*/
import java.util.ArrayList;
import java.util.List;

public class ListDemo1 
{
	public static void main(String []args)
	{

		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("B");
        

		for (int index = 0; index < list.size(); index++){

			System.out.println(list.get(index));
		}
	}
}
