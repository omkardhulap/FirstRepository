package collection;

import java.util.*;

public class JavaVectorExample 
{
 
    public static void main(String[] args)
{
  Vector<Object> vector = new Vector<Object>();
  int num1 = 101;
  Integer num2 = new Integer(202);
  String str1 = "Javaeschool";
  String str2 = "Learn Java with examples";
  vector.add(num1);
  vector.add(num2);
  vector.add(str1);
  vector.add(str2);
  vector.add(2, new Integer(303));
  System.out.println("The elements of vector are : " + vector);
  System.out.println("The size of vector is: " + vector.size());
  System.out.println("The element at position 2 is: "+ vector.elementAt(2));
  System.out.println("The first element of vector is: "+ vector.firstElement());
  System.out.println("The last element of vector is: "+ vector.lastElement());
  vector.removeElementAt(2);
  Enumeration enume=vector.elements();
  
  System.out.println("The elements of vector are : " + vector);
  while(enume.hasMoreElements()){
  System.out.println("The elements are: " + enume.nextElement());
  }  
  }
    
}
