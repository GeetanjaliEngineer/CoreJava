
import java.util.*; //package

public class DynamicArrayExample {

    public static void main(String[] args) {
        // Creating a dynamic array (ArrayList)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("Element at index 1: " + numbers.get(1)); // Output: 20

        // Modifying an element
        numbers.set(1, 25); // Replaces 20 with 25

        // Removing an element
        numbers.remove(0); // Removes the first element (10)

        // Checking size
        System.out.println("Size of array: " + numbers.size()); // Output: 2

        // Iterating over elements
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
