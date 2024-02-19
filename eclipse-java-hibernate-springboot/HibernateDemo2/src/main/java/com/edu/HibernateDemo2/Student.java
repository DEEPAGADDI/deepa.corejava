package com.edu.HibernateDemo2;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	int id;
	String name;
	float fee;
	String School_Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getSchool_Name() {
		return School_Name;
	}
	public void setSchool_Name(String school_Name) {
		School_Name = school_Name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float fee, String school_Name) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		School_Name = school_Name;
	}
	
	
	
	
}
