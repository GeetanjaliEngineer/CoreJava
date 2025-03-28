
public class LocalVariableExample {

    public void show() {
        int a = 10;
        System.out.println("Local Variable : " + a);
    }

    public static void main(String[] args) {
        LocalVariableExample obj = new LocalVariableExample();
        obj.show();

    }
}
// A local variable is a variable that is declared inside a method, constructor, or block and is only accessible within that scope.

// Characteristics of Local Variables:
// Declared inside a method, constructor, or block.
// Cannot be accessed outside the method or block in which they are declared.
// Must be initialized before use (Java does not assign a default value).

// Stored in the stack memory.
