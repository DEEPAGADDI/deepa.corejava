package com.edu.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
	@Id
	private int lid;
	private String lname;
	
	 @OneToOne
	   private StudentLaptop lap;
	
	public StudentLaptop getLap() {
		return lap;
	}
	public void setLap(StudentLaptop lap) {
		this.lap = lap;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}