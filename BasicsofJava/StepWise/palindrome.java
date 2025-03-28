
import java.util.Scanner;

public class palindrome {
//palindrom is number read from same forward and same backword from the middle number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);  // Reverse string
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }

        sc.close();
    }
}
