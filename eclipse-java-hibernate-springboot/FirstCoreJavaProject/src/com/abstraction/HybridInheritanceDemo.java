package com.abstraction;

class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}

interface Swimmer{
	public void swim();
}
interface Flyer{
	public void fly();
}

class Fish extends Animal implements Swimmer{

	@Override
	public void swim() {
		System.out.println("**Fish is swimming****");
	}
}

class Bird extends Animal implements Flyer{

	@Override
	public void fly() {
		System.out.println("---------Bird is flying--------");
	}
}

class FlyingFish extends Animal implements Swimmer,Flyer{

	public void fly() {
		System.out.println("-----------FlyingFish is flying---------");
	}

	public void swim() {
		System.out.println("***FlyingFish in swimming*****");
		}
}
public class HybridInheritanceDemo {
	public static void main(String[] args) {
	Fish ob=new Fish();
	ob.eat();
	ob.swim();
	System.out.println();
	
	Bird ob1=new Bird();
	ob1.eat();
	ob1.fly();
	System.out.println();
	
	FlyingFish ob3=new FlyingFish();
	ob3.eat();
	ob3.fly();
	ob3.swim();
	}
}
