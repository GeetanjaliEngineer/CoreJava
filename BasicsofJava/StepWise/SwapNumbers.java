
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println("Before Swap:" + a + ", b :" + b);
        a = a + b; //a stores sum of a and b
        b = a - b; // extracts originall a 
        a = a - b;// extracts original b 

        System.out.println("After swap: " + a + ", b:" + b);
    }
}
