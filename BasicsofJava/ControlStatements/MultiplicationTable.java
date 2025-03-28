// the program reads n integer from the user
// it uses a for loop to print the multiplication table from 1 to 10.

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
