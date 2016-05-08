/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;
/**
 *
 * @author Kavya_Ramakrishna
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListEx 
{
	public static void main(String args[]) throws Exception
	{
		//ArrayList that can contain only integers
		List<Integer>arr = new ArrayList<Integer>();
		ArrayListEx ex = new ArrayListEx();
		ex.getItems((ArrayList<Integer>) arr);
		Collections.sort(arr);
		// System.out.println(ex1.arr);
		System.out.println();
		Iterator<Integer> itr = arr.iterator();
		System.out.println("Elements of arraylist arr: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("size of the arraylist is "+arr.size());
		System.out.println("Does arraylist contain 44: "+arr.contains(44));
		arr.remove(0);
		System.out.println("Size of the array after removal of index 0: "+arr.size());
		System.out.println("The elements of arr after removal of index 0");
		Iterator<Integer> itr2 = arr.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

		//ArrayList that can contain any object
		ArrayList arrex1 = new ArrayList();
		arrex1.add(1);
		arrex1.add("str");
		arrex1.add(ex);
		Iterator itr1 = arrex1.iterator();
		System.out.println();
		System.out.println("Elements of arraylist arrex1: ");
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}


	public void getItems(ArrayList<Integer>arr) throws Exception
	{
		arr.add(44);
		arr.add(551);
		arr.add(33);
		arr.add(221);

		throw new Exception();
	}

}
