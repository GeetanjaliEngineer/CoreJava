import java.util.Scanner;

public class MySystem {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();

        System.out.println("This is for printing the writing characters.");
        System.err.println("This is how we throw an error with System.err");
   System.out.printf("Addition: %d" , x+y);
    }
}
