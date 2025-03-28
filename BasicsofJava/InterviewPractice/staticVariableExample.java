
public class staticVariableExample {

    static int staticVar = 100;

    public void show() {
        System.out.println("Static variable: " + staticVar);

    }

    public static void main(String[] args) {

        staticVariableExample obj1 = new staticVariableExample();
        staticVariableExample obj2 = new staticVariableExample();

        obj1.show();
        obj2.show();

        obj1.staticVar = 200;

        obj1.show();
        obj2.show();

    }
}
