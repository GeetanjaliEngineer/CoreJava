
import java.util.Scanner;
//product of all positive integer 

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int num = sc.nextInt();
        // initialize fact =1
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            //multiplies numbers from 1 to num
            fact *= i;
        }
        System.out.println("Factorial:" + fact);
        sc.close();
    }
}
