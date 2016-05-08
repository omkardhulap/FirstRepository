/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Kavya_Ramakrishna
 */
public class VectorDemo 
{
    private static Vector v;
    public static void printThis(Vector v1)
    {
        Enumeration en=v.elements();
        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement()+" ");
        }
    }
public static void main(String arg[])
{
    Product p1,p2,p3;
    p1=new Product(100,"HP");
    p2=new Product(111,"BP");
    p3=new Product(110,"BPL");

    v=new Vector(3);
    
    v.add(p1);
    v.add(p2);
    v.add(p3);
    System.out.println(v.capacity());
    printThis(v);
    }
}

class Product
{
    int batchcode;
    String brand;

    Product(int b,String br)
    {
        batchcode=b;
        brand=br;
    }

    @Override
    public String toString()
    {
        return ""+brand+":"+batchcode;
    }
}