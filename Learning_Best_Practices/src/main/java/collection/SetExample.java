package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        // Set example with implement TreeSet - duplicates are not allowed, sorts the set
        Set<Integer> s=new TreeSet<Integer>();

        s.add(800);
        s.add(200);
        s.add(750);
        s.add(100);
        s.add(2);
        s.add(200);

        Iterator it=s.iterator();
        while(it.hasNext())
        {
          System.out.println("Value :"+it.next());
        }
    }
}
