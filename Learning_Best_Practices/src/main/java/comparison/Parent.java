/**
 * Author : Omkar
 */
package comparison;

import java.util.Comparator;

public class Parent implements TelephoneInterface, MobileInterface,Comparator<Parent>{

	String name; 
	long salary;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Arguments
	 */
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Arguments
	 */
	public Parent(String name, long salary, String address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Parent p1, Parent p2) {
		return p1.getName().compareTo(p2.getName());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see comparison.TelephoneInterface#getNumber()
	 */
	@Override
	public void getNumber() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
