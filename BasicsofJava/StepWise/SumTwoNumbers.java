//read user input

import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {
        //create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        //read an integer from the user and stores it in a
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");

        int b = scanner.nextInt();
        //calculate sum of a and b 
        int sum = a + b;

        System.out.println("Sum of two numbers: " + sum);
        //close scanner to avoid resource leaks.
        scanner.close();

    }
}
