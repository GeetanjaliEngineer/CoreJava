package JavaAmigo;

public class MathFunctionsDemo {

    public static void main(String[] args) {
        double x = 2.7;
        double y = -3.7;
        int a = 9;
        int b = 5;

        // Basic arithmetic operations
        System.out.println("Math.abs(" + x + ") = " + Math.abs(x));
        System.out.println("Math.ceil(" + x + ") = " + Math.ceil(x));
        System.out.println("Math.floor(" + x + ") = " + Math.floor(x));
        System.out.println("Math.round(" + x + ") = " + Math.round(x));
        System.out.println("Math.max(" + x + ", " + y + ") = " + Math.max(x, y));
        System.out.println("Math.min(" + x + ", " + y + ") = " + Math.min(x, y));

        // Exponential and logarithmic functions
        System.out.println("Math.pow(" + x + ", 2) = " + Math.pow(x, 2));
        System.out.println("Math.sqrt(" + x + ") = " + Math.sqrt(x));
        System.out.println("Math.cbrt(" + x + ") = " + Math.cbrt(x));
        System.out.println("Math.exp(" + x + ") = " + Math.exp(x));
        System.out.println("Math.log(" + x + ") = " + Math.log(x));
        System.out.println("Math.log10(" + x + ") = " + Math.log10(x));

        // Trigonometric functions
        System.out.println("Math.sin(" + x + ") = " + Math.sin(x));
        System.out.println("Math.cos(" + x + ") = " + Math.cos(x));
        System.out.println("Math.tan(" + x + ") = " + Math.tan(x));
        System.out.println("Math.asin(" + x + ") = " + Math.asin(x));
        System.out.println("Math.acos(" + x + ") = " + Math.acos(x));
        System.out.println("Math.atan(" + x + ") = " + Math.atan(x));
        System.out.println("Math.atan2(" + y + ", " + x + ") = " + Math.atan2(y, x));

        // Random number generation
        System.out.println("Math.random() = " + Math.random());

        // Other functions
        System.out.println("Math.signum(" + y + ") = " + Math.signum(y));
        System.out.println("Math.copySign(" + x + ", " + y + ") = " + Math.copySign(x, y));
        System.out.println("Math.ulp(" + x + ") = " + Math.ulp(x));
        System.out.println("Math.nextUp(" + x + ") = " + Math.nextUp(x));
        System.out.println("Math.nextDown(" + x + ") = " + Math.nextDown(x));
        System.out.println("Math.IEEEremainder(" + a + ", " + b + ") = " + Math.IEEEremainder(a, b));
    }
}