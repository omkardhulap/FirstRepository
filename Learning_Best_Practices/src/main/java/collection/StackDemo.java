/**
 * Author : Omkar
 */
package collection;

import java.util.Stack;

/**
 * 
 */
public class StackDemo {
	public static void main(String[] args){
		int i1=1;
		int i2=2;
		int i3=3;
		int i4=2;

		//Stack creation
		Stack<Integer> s1=new Stack<Integer>();
		//Adding elements to the stack
		s1.push(new Integer(i1));
		s1.push(new Integer(i2));
		s1.push(new Integer(i3));
		s1.push(new Integer(i4));
		System.out.println(s1);
		//Removing elements from the stack;
		Integer x;

		x= s1.pop();
		System.out.println(x);
		x= s1.pop();
		System.out.println(x);
		x= s1.pop();
		System.out.println(x);
		x= s1.pop();
		System.out.println(x);
	}
}
