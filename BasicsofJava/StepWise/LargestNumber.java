
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        //Ternary operator = find the largest

        int largestNumber = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);
        System.out.println("Largest Number: " + largestNumber);
        sc.close();

    }
}
