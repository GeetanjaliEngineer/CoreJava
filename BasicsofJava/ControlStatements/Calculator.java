//the program takes two numbers and an arithmetic operator(+,-,*,/)

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        System.out.println("Enter an operator( +,-,*,/) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(" Result:" + (num1 + num2));
                break;
            case '-':
                System.out.println("Result :" + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;

            default:
                System.out.println("invalid operator");
        }
        sc.close();

    }
}
