package generics;

import java.util.*;

public class ListWildcardsBound {
	public static void sumOfElements(List<? extends Number> li){
		double sum=0;
		for(Object element:li){
			System.out.println(element);
		}
		System.out.println("Sum of elements of the List is: "+sum);  
	}           
	public static void main(String[] args) {
		List<Integer> i1=new ArrayList<Integer>();
		i1.add(new Integer(100));
		i1.add(new Integer(200));
		i1.add(new Integer(300));
		sumOfElements(i1);
		
		List<Double> i2=new ArrayList<Double>();
		i2.add(new Double(100));
		i2.add(new Double(200));
		i2.add(new Double(300));
		sumOfElements(i2);
                
                List<Number> listNum= new ArrayList<Number>();
                sumOfElements(listNum);
		
		List<String> i3=new ArrayList<String>();
		//sumOfElements(i3);
		
		List<Object> list = new ArrayList<Object>();
		//sumOfElements(list);
		
	}    
} 