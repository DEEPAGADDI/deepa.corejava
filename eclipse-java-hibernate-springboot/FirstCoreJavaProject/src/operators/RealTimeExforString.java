package operators;

import java.util.Scanner;

public class RealTimeExforString {

	public static void main(String[] args) {
		String name="ramya";
		String pass="ram";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String un=sc.nextLine();
		System.out.println("Enter password : ");
        String pw=sc.nextLine();

        if(name.equals(un) && pass.equalsIgnoreCase(pw)) {
        	System.out.println("login successfully");
        }
        else
        {
        	System.out.println("login failed");
        }
        
        	
       
	}

}		