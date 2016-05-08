package collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashDemo {
	
	  public static void main(String[] args) {
	    LinkedHashMap<String,String> lHashMap = new LinkedHashMap<String,String>();
	    lHashMap.put("2", "Five");
	    lHashMap.put("1", "One");	   
	    lHashMap.put("3", "Three");
	    Set s=lHashMap.entrySet();

        //Move next key and value of Map by iterator
        Iterator it=s.iterator();

        while(it.hasNext())
        {
            // key=value separator this by Map.Entry to get key and value
            Map.Entry m =(Map.Entry)it.next();

            // getKey is used to get key of Map
            String key=(String)m.getKey();

            // getValue is used to get value of key in Map
            String value=(String)m.getValue();

            System.out.println("Key :"+key+"  Value :"+value);
        
           // boolean blnExists = mp.containsKey(new Integer(3));
           // System.out.println("3 exists in HashMap ? : " + blnExists);
        
        }
	    //boolean blnExists = lHashMap.containsValue("Two");
	    //System.out.println(blnExists);
	  }
	}
