public class ClassVariable {
    // Static constant for PI (renamed to follow Java naming conventions)
    private static final double PI = 3.14159;
    
    // Instance variable for radius
    private double radius;

    // Constructor to initialize radius
    public ClassVariable(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return PI * Math.pow(radius, 2); // Using Math.pow() for better readability
    }

    public static void main(String[] args) {
        // Creating an instance of ClassVariable with a given radius
        ClassVariable circle = new ClassVariable(5.0);
        
        // Printing the area of the circle
        System.out.println("Area of the Circle: " + circle.getArea());
    }
}
