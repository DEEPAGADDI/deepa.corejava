package com.edu.HibernateScanner;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Employee")
public class Employee1 {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
//@Column(name="Employee_name")//to change column name
private String Name;
//@Column(name="Employee_Salary")
private float Salary;

private String Department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
}
