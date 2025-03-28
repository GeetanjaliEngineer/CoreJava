
import java.util.Scanner;

public class StringToInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String str = sc.next();
        // Uses Integer.parseInt(str) to convert string to integer.
        int num = Integer.parseInt(str);
        System.out.println("Converted Integer: " + num);

        sc.close();
    }

}
