package com.LambdaExpression;


import java.util.Scanner;
import java.util.function.BiPredicate;


public class Demo5UnameAndPasswardMam {
    public static void main(String[] args) {
        String validUsername = "Bob";
        String validPassword = "Bob123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String uname = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        // Use a lambda expression with BiPredicate to check if the entered credentials are valid
        BiPredicate<String, String> isLoginValid = (username, password) -> 
            username.equals(validUsername) && password.equals(validPassword);

        if (isLoginValid.test(uname, pass)) {
            System.out.println("Login successful. Welcome, " + uname + "!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}