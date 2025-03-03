package JavaAmigo;
import java.util.Scanner;
public class MainM {

	public static void main(String[]  args) {
		 Scanner scanner = new Scanner(System.in); // Create a Scanner object

	        System.out.println("Enter a G (1-3): ");
	        int choice = scanner.nextInt(); // Read user input

	        // Use the input in a switch statement
	        switch (choice) {
	            case 1:
	                System.out.println("You chose option 1!");
	                break;
	            case 2:
	                System.out.println("You chose option 2!");
	                break;
	            case 3:
	                System.out.println("You chose option 3!");
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close(); // Close the scanner to avoid resource leaks
	    }
	}