package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();
        list.add("One"); // Line-1
        list.add("Two"); // Line-2

        if (list.isEmpty()) {
            System.out.println("Given list is empty");
        } else {
            System.out.println("List is not empty list and elements are :");
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String str = iterator.next();
                System.out.println("\t" + str + "   ");
            }
        }

        if (list.contains("Two")) {
            System.out.println("Two is present in list");
        } else {
            System.out.println("two is not present in list");
        }

        List<String> newList = new ArrayList<String>();
        newList.add("One");
        newList.add("Two");
        newList.add("Three");

        if (list.equals(newList)) {
            System.out.println("Both the list and newList are equal");
        } else {
            System.out.println("list and newList are not equal");
        }

        Object[] newListArray = newList.toArray();
        System.out.println("Second element of the array " + newListArray[1]);

        System.out.println("Hash code for list :" + list.hashCode());
        System.out.println("Hash code for newList :" + newList.hashCode());

        System.out.println("Size of list is :" + list.size());

        list.remove("One");

        System.out.println("Size of list after removing one element :" + list.size());

        list.clear();

        System.out.println("size of the list after clear is" + list.size());

    }
}
