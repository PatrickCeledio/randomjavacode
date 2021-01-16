/*
*  Assignment 4
*  Description: Print a triangle using loops
*  Name: Patrick Celedio
*  ID: 920457223
*  Class: CSC 210-07
*  Semester: Fall 2019
*/


import java.util.*;

public class Triangle {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		// Create a Scanner object
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("**Triangle Simulator 2019!**\nEnter '1' to print out a triangle! ");
		int userChoice = userInput.nextInt();
		
		// Fancy menu
		switch(userChoice) {
		case 1:
			printTriangle();
			break;
		default:
			// Inadequate error catch 
			System.out.println("Invalid input.\n");
			menu();
		};
	}
	
	public static void printTriangle() {
		// Nested for loop which will print out the right triangle
		Scanner userInput = new Scanner(System.in);
		
		// User inputs int which will determine dimensions of right triangle
		System.out.println("Input the size of your triangle: (1-100) ");
		int size = userInput.nextInt();
		
		// Boundary checks
		if (size == 0) {
			System.out.println("Not within boundaries.\n");
			printTriangle();
		}else if (size > 100) {
			System.out.println("Too large.\n");
			printTriangle();
		}
		
		// Add one to variable size bc size starts at 0, and we want to be within range (1-100), not (0-99)
		size++;
		
		// Outer loop prints row
		for(int i = 0; i < size; i++){
			
			// Inner loop 1 prints out one space, then the star at the end
			for(int j = 0; j < size; j++) {
				System.out.print(" ");
				}
			// Inner loop 2 prints out the star at the end, this is ahead of inner loop 1 bc j=1
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");	
			}
			
			// Print next row of right triangle
			System.out.println();
			
		}
		
		// What is the point of a user inputting 1?  It is not even a triangle.
		if (size == 2) {
			System.out.print("\nlol\n\n");
		}
		
		// Goes back to menu to repeat program
		menu();
	}
}
