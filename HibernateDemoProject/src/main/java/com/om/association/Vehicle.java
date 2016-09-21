package com.om.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author omkar
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
@Entity
class Vehicle {

	@Id
	int vid;
	
	@Column
	String vname;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

}
