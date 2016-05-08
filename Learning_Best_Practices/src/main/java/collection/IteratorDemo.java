package collection;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo {
	   public static void main(String args[]) {
	      // Create an array list
	      ArrayList al = new ArrayList();
	      // add elements to the array list
	      al.add("J");
	      al.add("Y");
	      al.add("O");
	      al.add("T");
	      al.add("H");
	      al.add("I");

	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
}
}
