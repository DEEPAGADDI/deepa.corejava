package com.string;

import java.util.Scanner;

public class RealTimeExForStringBuffer {

	public static void main(String[] args) {

		
		
        // Create a StringBuffer to store the text
        StringBuffer textBuffer = new StringBuffer();

        // Simulate user input (typing and editing)
        System.out.println("Welcome to the Text Editor!");
        System.out.println("Type your text. Enter 'exit' to finish.");

        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            // Get user input
            System.out.print("Enter text: ");
            userInput = scanner.nextLine();

            // Append the user input to the text buffer
            textBuffer.append(userInput).append("\n");

        } while (!userInput.equalsIgnoreCase("exit"));

        // Display the final edited text
        System.out.println("\nFinal Edited Text:");
        System.out.println(textBuffer.toString());

        // Close the scanner
        scanner.close();
    }
}