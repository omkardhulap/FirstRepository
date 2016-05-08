package inheritance;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map;

public class Mother {

	public enum status{MARRIED, UNMARRIED};

	public static Map<Child, String> map = new HashMap<Child,String>();

	public static Map<status, String> enumMap = new HashMap<status,String>();

	static{
		enumMap.put(status.MARRIED, "Gayatri");
		enumMap.put(status.UNMARRIED, "Omkar");
	}

	public static void main(String[] args)
	{

		Child c1 = new Child(4);
		Child c2 = new Child(5);
		Child c3 = new Child(6);

		map.put(c1,"Hi1");
		map.put(c2,"Hi2");
		map.put(c3,"Hi3");
		
		Child c4 = new Child(5);
		
		System.out.println(map.get(c4));
		
	}
}
