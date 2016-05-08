package generics;

import java.util.*;
public class ListWildcards {
	public static void printList (List<?>  list){
		for(Object element:list){
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("One");
		ls.add("Two");
		ls.add("Three");
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(new Integer(100));
		li.add(new Integer(200));
		li.add(new Integer(300));
		
		List rawList = new ArrayList();
		rawList.add(new String("XYZ"));
		rawList.add(new Integer(10));

		printList(ls); 
		printList(li); 
		printList(rawList);
		
	}
}