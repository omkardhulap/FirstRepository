package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayListDemo ald = new ArrayListDemo();
		ald.swapArray();
	}
	
	private void swapArray(){
		Integer[] arr = {1,2,3,-2,-3,-7,5,-6};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(arrayList);
		
		boolean isPreviousElementPositive = true;
		
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>0){
				isPreviousElementPositive = true;
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]>0){
						Collections.swap(arrayList, i+1, j);
					}
				}
			}else{
				isPreviousElementPositive = false;
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]<0){
						Collections.swap(arrayList, i+1, j);
					}
				}
			}
		}
		System.out.println(arrayList);
	}
	
	private void printArray(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}
	
	private void listFunction(){
		List<String> list = new ArrayList<String>();

		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");

		System.out.println( list.get(2));

	    Collections.sort(list);

	    for (String element : list)
	    {
	      System.out.println(element);
	    }

		System.out.println( list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Object [] a = list.toArray();
		System.out.println( a);

		String[] b = list.toArray(new String[0]);
		System.out.println( b);
	}
}
