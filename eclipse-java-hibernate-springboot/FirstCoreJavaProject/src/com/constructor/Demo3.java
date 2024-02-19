package com.constructor;


class Car1{
	long price,year;
	String name;
			
	Car1(String name, long price,long year){
		System.out.println("Name: "+name+"\n"+"Price: "+price+"\n"+"Year: "+year);
	}
		
}
public class Demo3 {

	public static void main(String[] args) {
		
		Car1 ob1=new Car1("Thar",50000,2022);
		Car1 ob2=new Car1("Maruthi",30000,2021);
		Car1 ob3=new Car1("Innova",25000,2022);
		
	}

}