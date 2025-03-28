
import java.util.Scanner;

public class SimpleInterest {

    //  Interest = (P × R × T) / 100.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amound: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter time in years: ");
        double time = sc.nextDouble();

        double interst = (principal * rate * time) / 100;
        System.out.println("Simple interest :" + interst);
        sc.close();

    }
}
