
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt(), rev = 0;

        while (a != 0) {
            rev = rev * 10 + a % 10;

            a /= 10;

        }
        System.out.println("reversed number: " + rev);
        sc.close();

    }
}
