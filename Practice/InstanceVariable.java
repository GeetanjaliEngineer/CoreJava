import java.io.*;


public class InstanceVariable {
     private String name;
     public void setName(String name) {
        this.name = name;
     }
        public String getName() {
            return name;
        }
        public static void name(String[] args)
         {
            InstanceVariable obj = new InstanceVariable();
            obj.setName("Geetanjali");
            System.out.println("Name" + obj.getName());
                 }
        }
    
    