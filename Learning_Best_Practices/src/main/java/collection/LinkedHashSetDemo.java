package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
//insertion order
public class LinkedHashSetDemo {
	public static void main(String[] args) {
	    LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();

	    lhashSet.add(new Integer("100"));
	    lhashSet.add(new Integer("200"));
	    lhashSet.add(new Integer("300"));
	    lhashSet.add(new Integer("200"));
	    Iterator itr = lhashSet.iterator();

	    while (itr.hasNext()){
	      System.out.println(itr.next());
	    }
	  }
}
