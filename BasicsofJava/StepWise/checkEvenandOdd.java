
import java.util.Scanner;

public class checkEvenandOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // check if remainder when num is divided by 2 is 0
        if (num % 2 == 0) {
            System.out.println("This is even Number");
        } else {
            System.out.println("This is not a even number.");
        }

        sc.close();
    }
}
