package om;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import om.Testclass.Seasons;
import common.MyProjectConstants;

import utility.MyProjectProperties;

public class P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*try{
			try{}finally{}
		}catch(Exception e){}*/
		
		Testclass t1 = new Testclass();
		
		Object object = new Object();
		
		List<String> a = new ArrayList<String>();
		
		Collections.sort(a);
		
		/*long millisec = System.currentTimeMillis();
		System.out.println("millisec 1>>"+millisec);
		for(int i : Testclass.A1) {
			final int j = i+(i-1);
			System.out.println("T1.A1>>"+j);
		}
		
		int k = 0;
		while(k > 10000000)
			k++;
		System.out.println("millisec 2>>"+(System.currentTimeMillis()-millisec));
		for(Integer j : t1.getA2())
			System.out.println("T1.A2"+j);
		System.out.println("T1.A2_pub"+t1.A2_pub.toString());
		System.out.println("B1"+Testclass.B1);*/
		
//		System.out.println("File :"+t1.readMyFile());
		
		/*System.out.println(MyProjectProperties.getValue(MyProjectConstants.myHome)); 
		System.out.println(MyProjectProperties.getValue(MyProjectConstants.myWork)); 
		System.out.println(MyProjectProperties.getValue(MyProjectConstants.myName));
		System.out.println(MyProjectProperties.getValue(MyProjectConstants.myStream));
		System.out.println(MyProjectProperties.getValue(MyProjectConstants.nextJob));*/
		
		//Testclass.compare(10, 20);
		
		/*Testclass.Seasons seasons = Seasons.HO;
		System.out.println("Seasons : "+ seasons.HO);*/
		
		/*try{
			int i=0;
			while(true){
				System.out.println("Array element>>"+Testclass.A1[i]);
				i++;
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array ended!!");
		}finally{
			System.out.println("Came to finally!!");
		}*/
		//Testclass.j=Testclass.i;
		//Testclass.i%=Testclass.i;
		//(Testclass.i!= Testclass.i)? System.out.println("yes"):System.out.println("no");
		/*System.out.println("Value of int>>"+Testclass.i);
		System.out.println("Value of double>>"+Testclass.j);
		System.out.println("Value of assigned double>>"+Testclass.k);
		Testclass.i=(int) Testclass.k;
		System.out.println("Value of assigned int>>"+Testclass.i);*/
//		Testclass.readMyFile();
		
		
	}
}
