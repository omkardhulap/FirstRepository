//Collections:MAP

package collection;
/**
*
* @author Kavya_Ramakrishna
*/

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAPDemo
{

	public static void main(String[] args)
	{
		////prints in LIFO order
		Map<Object, Object> map = new TreeMap<Object, Object>();
		map.put(2,"A");
		map.put(1,null);
//		map.put(null,"C");
//		map.put(null,"D");
//		map.put(null,null);
		
		//prints in FIFO order
		/*Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put(2,"A");
		map.put(1,null);
		map.put(null,"C");
		map.put(null,"D");
		map.put(null,null);*/
		
		//prints in LIFO order
		/*Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(null,null);
		map.put(2,"A");
		map.put(1,null);
		map.put(null,"C");
		map.put(null,"D");*/
		

//		Collections.checkedMap(map, Integer.class, String.class);
        //Using enhanced For loop
		/*Collection<Object> collection = map.values();
		for(Object element : collection){
			System.out.println(element);
		}*/
		
		for(Object element : map.keySet()){
			System.out.println(element +":"+ map.get(element));
		}
		
	}
}
