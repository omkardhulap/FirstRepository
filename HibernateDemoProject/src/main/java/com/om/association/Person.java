package com.om.association;

/**
 * @author omkar
 */
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

@Entity
public class Person {
	
	@Id
	int pid;
	
	@Column
	String pname;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Vehicle> vehicles;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
