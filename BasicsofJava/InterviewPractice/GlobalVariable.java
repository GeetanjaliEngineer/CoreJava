
public class GlobalVariable {

    int instanceVaribale = 50;

    public void display() {
        System.out.println("Instance vairbale : " + instanceVaribale);
    }

    public static void main(String[] args) {
        GlobalVariable obj = new GlobalVariable();
        obj.display();
    }
}
