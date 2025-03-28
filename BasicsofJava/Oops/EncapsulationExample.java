// Encapsulation example in Java

class Student {

    // Private data members (cannot be accessed directly)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Ensuring valid data
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        // Creating an object of Student class
        Student s = new Student();

        // Setting values using setter methods
        s.setName("John Doe");
        s.setAge(22);

        // Getting values using getter methods
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
