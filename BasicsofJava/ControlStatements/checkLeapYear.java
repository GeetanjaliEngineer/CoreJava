//the program reads a year from year 
// a year is leap year if: *
// it is disivible by 4 and not divisible by 100 or by 400)
// the program check these condiitons and prints wheather it is a leap year .

import java.util.Scanner;

public class checkLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year :");
        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("This is leap year.");
        } else {
            System.out.println("this is not leap year");
        }
        sc.close();

    }
}
