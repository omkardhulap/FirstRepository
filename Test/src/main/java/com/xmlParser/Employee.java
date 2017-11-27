/**
 * Author :
 */
package com.xmlParser;

/**
 * @author Omkar
 *
 */
public class Employee {

	private String type;
	private String Name;
	private int Id;
	private int Age;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}

	/**
	 * Arguments
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Arguments
	 */
	public Employee(String name, int id, int age, String type) {
		super();
		this.type = type;
		Name = name;
		Id = id;
		Age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [type=" + type + ", Name=" + Name + ", Id=" + Id
				+ ", Age=" + Age + "]";
	}
	
	
	
}
