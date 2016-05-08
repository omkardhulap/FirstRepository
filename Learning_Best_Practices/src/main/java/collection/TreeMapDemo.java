package collection;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;
public class TreeMapDemo {
	
	
	  public static void main(String[] args) {
	    TreeMap<String, String> treeMap = new TreeMap<String, String>();
	    treeMap.put("1", "One");
	    treeMap.put("3", "Three");
	    treeMap.put("2", "Two");
	    treeMap.put("2", "Four");
	    Collection<String> st = treeMap.values();
	    
	    Iterator itr = st.iterator();
	    while (itr.hasNext()){
	      System.out.println(itr.next());
	    }
	    st.remove("1");

	    //System.out.println(treeMap.containsKey("1"));
	  }
	}
