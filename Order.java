
import java.util.*;

public class Order {
	public static void main (String args[]) {
		System.out.println("                   _                   _     _      ");
		System.out.println("                  | |                 | |   | |[]     ");
		System.out.println(" _ __ ___   ___ __| | ___  _ __   __ _| | __| |___ ");
		System.out.println("| '_ ` _ \\ / __/ _` |/ _ \\| '_ \\ / _` | |/ _` / __|");
		System.out.println("| | | | | | (_| (_| | (_) | | | | (_| | | (_| \\__ \\");
		System.out.println("|_| |_| |_|\\___\\__,_|\\___/|_| |_|\\__,_|_|\\__,_|___/");
		System.out.println("");
		System.out.println("Welcome to McDonald's. I am your virtual assistant. I am ready to receive your order./n");

		// Initialize and declare tax
		// Tax in San Francisco, CA is currently 8.5%
		double tax = 0.085;
		
		// Initialize and declare variable to hold total amount due for user
		double total = 0;
		
		// Object for user input
		Scanner userInput = new Scanner(System.in);
		
		// The menu
		System.out.println("");
		System.out.println("Menu");
		System.out.println("1. Fries   $5");
		System.out.println("2. Burger  $7");
		System.out.println("3. Soda    $4");
		System.out.println("4. Coffee  $3");
		System.out.println("5. Donut   $6");
		
		// Take in user input
		System.out.println("Enter your choice: ");
		int menuChoice = userInput.nextInt();
		
		// Switch statement which takes in int from menuChoice as argument
		switch(menuChoice) {
		case 1:
			// Depending on case, total will initially be set as the menu item price,
			// and then total += (total*tax), then finally tip will be added to total
			// at the end before output
			total = 5;
			

			System.out.println("**Recipt**");
			System.out.println("Fries = $5");
			tax *= total;
			System.out.println("Tax = $" + tax);
			total += tax;
			System.out.println("Amount due: $" + total);
			
			// Initialize and declare variable tip 
			System.out.println("******Enter Tip: $******"); 
			System.out.println("15% = $" + total*.15 + " 20% = $" + total*.20 + " 25% = $" + total*.25);
			double tip = userInput.nextDouble();
			
			total += tip;
			
			System.out.println("Final amount spent: $" + total);
			System.out.println("Thank you for the order!!");
			System.out.println("Your number is: " + Math.random());

			
			break;
		case 2:
			total = 7;
			break;
		case 3:
			total = 4;
			break;
		case 4:
			total = 3;
			break;
		case 5:
			total = 6;
			break;
		case 6:
			break;
		default:
			System.out.println("Invalid input. Application terminating.");
		
		
		}
	}
}
