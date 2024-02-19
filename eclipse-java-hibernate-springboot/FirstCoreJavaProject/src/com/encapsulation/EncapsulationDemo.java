package com.encapsulation;


class Student{
	//1.Declare variable
	private String usn;
	private String name;
	private float percentage;
	
	//2.constructor
	public Student(String usn, String name, float percentage) {
		super();
		this.usn=usn;
		this.name=name;
		this.percentage=percentage;
	}
	
	//3.getter setter methods
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn=usn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public float getPercentage() {
		return percentage;
	
	}
	public void setPercentage(float percentage) {
		this.percentage=percentage;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student ob=new Student("20UCSB7024","ramya",89);
		System.out.println("My name is "+ob.getName());
		System.out.println("My usn is "+ob.getUsn());
		System.out.println("My percentage is "+ob.getPercentage());

	}

}