package JavaPractice;

import java.util.Scanner;

public class readInput {

	public static void main(String[] args) {

		String a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		a = scanner.nextLine();

		System.out.println("Enter the second integer");
		String b = scanner.nextLine();

		String c = a + b;
		System.out.println("the value is " + c);

		scanner.close();
	}
}
