
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num != 0) {
            //extracts last digit using num%10
            int digit = num % 10;
            //build reversed number using this logic
            rev = rev * 10 + digit;
            //remove last digit using this logic n/=10
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);
        sc.close();
    }
}
