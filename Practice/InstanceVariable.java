public class InstanceVariable {
    
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Main method
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.setName("Geetanjali");
        System.out.println("Name: " + obj.getName());
    }
}
