
public class WrapperDemo {

    public static void main(String[] args) {
        // Autoboxing (Converting primitive to wrapper object)
        Integer intObj = 10;
        Double doubleObj = 200.;
        Boolean boolObj = true;

        // unboxing (Converting wrapper object to primitive)
        int intVal = intObj;
        double doubleVal = doubleObj;
        boolean boolVal = boolObj;

        // Printing values
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Unboxed int: " + intVal);
        System.out.println("Unboxed double: " + doubleVal);
        System.out.println("Unboxed boolean: " + boolVal);
    }
}
