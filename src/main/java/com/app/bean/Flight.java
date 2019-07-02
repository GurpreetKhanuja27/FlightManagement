package com.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Flight")
@XmlRootElement
public class Flight {

	@Id
	@Column(name = "fid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fid;
	
	@Column(name = "flight_name")
	private String fname;
	
	@Column
	private String description;
	
	@Column
	private int numberofseats;

	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(int fid, String fname, String description, int numberofseats) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.description = description;
		this.numberofseats = numberofseats;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberofseats() {
		return numberofseats;
	}

	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	
	

	
}
