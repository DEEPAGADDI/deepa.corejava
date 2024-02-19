package com.encapsulation;

class Bank{
	private double balance;
	private double wamount;
	private double damount;
	
	public Bank(double balance) {
		super();
		this.balance=balance;
		
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWamount() {
		return wamount;
	}

	public void setWamount(double wamount) {
		this.wamount = wamount;
	}

	public double getDamount() {
		return damount;
	}

	public void setDamount(double damount) {
		this.damount = damount;
	}
	
	public double deposit(double amt) {
		System.out.println("Initial balance is "+balance);
		return balance+=amt;
	}
	public double withdraw(double amt1) {
		if(balance>amt1) {
			System.out.println("withdraw amount from "+balance);
			return balance-=amt1;
		}
		else
			System.out.println("Insufficient balance");
		return balance;
		
	}
}
public class BankRealTimeExforEncapsulation {

	public static void main(String[] args) {
		Bank ob=new Bank(5000);
		ob.deposit(3000);
		System.out.println("After deposite = "+ob.getBalance());
		ob.withdraw(2000);
		System.out.println("Balance is  = "+ob.getBalance());
	}

}