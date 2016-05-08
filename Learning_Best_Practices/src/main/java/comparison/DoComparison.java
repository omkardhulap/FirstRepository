/**
 * Author : Omkar
 */
package comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DoComparison {

	public static void main(String[] args) {
		
		DoComparison dc = new DoComparison();
		dc.childComparison();
	}
	
	private void childComparison(){
		List<Student> stdL = new ArrayList<>();
		Student s1 = new Student("a",1,"A");
		stdL.add(s1);
		stdL.add(new Student("a",1,"A"));
		stdL.add(new Student("z",2,"B"));
		stdL.add(new Student("c",3,"C"));
		stdL.add(new Student("x",4,"D"));
		
		System.out.println(stdL);
		Collections.sort(stdL);
		System.out.println(stdL);
		Collections.rotate(stdL,2);
		System.out.println(stdL);
		
//		stdL = Collections.emptyList();
//		stdL = new ArrayList<>();
		
//		stdL.clear();
//		System.out.println(stdL);
//		stdL.add(new Student("a",1,"A"));
//		stdL.add(new Student("z",2,"B"));
//		stdL.add(new Student("c",3,"C"));
//		stdL.add(new Student("x",4,"D"));
		
//		System.out.println(Collections.frequency(stdL, s1));
//		Collections.fill(stdL, s1);
//		System.out.println(Collections.frequency(stdL, s1));
		
		System.out.println(Collections.max(stdL));
		System.out.println(Collections.min(stdL));
		
		
		
		System.out.println(stdL);
		
		Set<Student> tdl1 = new HashSet<>();
		tdl1.add(new Student("a",1,"A"));
		tdl1.add(new Student("z",2,"B"));
		tdl1.add(new Student("c",3,"C"));
		tdl1.add(new Student("x",4,"D"));
		
		
		
	}
	
	private void parentComparison(){
		List<Parent> stdL = new ArrayList<>();
		Parent p1 = new Parent("a",1,"A");
		Parent p2 = new Parent("z",2,"B");
		Parent p3 = new Parent("c",3,"C");
		Parent p4 = new Parent("x",4,"D");
		
		System.out.println(stdL);
		
		SortedSet psdl = new TreeSet();
	}
	
	
	

}
