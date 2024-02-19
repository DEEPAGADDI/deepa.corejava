package com.edu.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
//@Table(name="Employee_table")
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eid;
	String name;
	float salary;
	String email;
	
	
	//2.getter & setter
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	//3.constructor
	public Employee1(int eid, String name, float salary, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	
	
	//4.SuperClass constructor
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
