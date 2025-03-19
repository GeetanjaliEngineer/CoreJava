	
		
		import java.time.LocalDate;
	import java.util.Date;
		
		public class Main { //main class / main method
	
	public static void main(String[] args) { 
		
	//		In Java, public static void main(String[] args) is the method signature for the entry point of a Java program. 
	
	//		public:
	//		This is an access modifier, which means that the main method can be accessed from anywhere, including other classes.
	
	//		static:
	//		This keyword indicates that the main method belongs to the class itself, not to any instance of the class. 
	//This allows the JVM to call the
	//method without creating an object of the class. 
	
	//		void:
	//		This indicates that the main method does not return any value.
	
	//		main:
	//		This is the name of the method, which is a special name recognized by the Java Virtual Machine (JVM) 
	//as the starting point for the program.
	
	//		String[] args:
	//		This is an array of strings that holds any command-line arguments passed to the program when it is run.
	
	//		In simpler terms:
	//		This method is the starting point for your Java program.
	//		It is called by the JVM when you run your program.
	//		It can accept command-line arguments, which are stored in the args array.
	//		It does not return any value.
	
	
	//Print first Line
	
	//		System. out. println() is a method in Java or a statement 
	//		that is used to display a message, data, or string on
	//		the screen as the output. 
	//		It displays the arguments that are passed to it
		
	System.out.println("Hooray my first java app.");
	
	
	//Two types of comments 
	//single line comment
	
	/*multilinecomment
	 * 
	 * a
	 * a
	 * 
	 */
	
	//variables
	System.out.println("___________________Variables_____________________");
	System.out.println("______________primitive____________");
	int number =100;
		double num =199.43;
		String brand ="Geetanjalicodes";
	Date date = new Date();
	
	//primitive
	byte theByte = -128;
	short theshort = 525;
	int theInt =5556224;
	long thelong =4545444745444497657L;
	
	float pi=3.14F;
	double doublepi = 3.1415;
		boolean isAdult = true;
		char nameInitial ='A';
		
	System.out.println(number);
	System.out.println(num);
	System.out.println(brand);	
	System.out.println(date);
	System.out.println(theByte);	
	System.out.println(theshort);
	System.out.println(theInt);
	System.out.println(thelong);
	System.out.println(pi);	
	System.out.println(doublepi);
	System.out.println(isAdult);
	System.out.println(nameInitial);	
	
	System.out.println("____________NonPrimitive Datatypes____________________");
	
	//Non Primitive data types - reference type
	String name = new String("Geetanjalicodes");
	System.out.println(name.toUpperCase()); //Capital Letters
	 LocalDate now = LocalDate.now();
	 System.out.println(now.getMonth());
	 
	 //Primitive n reference types difference 
	 System.out.println("______________Difference_________________");
	 
	 int a = 10;  //memory allocation
	 int b = a;   //b is in different memory address
	 a = 100;
	 System.out.println("a=" + a + " and " + "b=" + b);
	 
	 
	 System.out.println("__________________________");
	 Person alex = new Person("alex");
	 Person mariam = alex;
	 
	 System.out.println("before changing alex");
	 System.out.println(alex.name + " " + mariam.name);
	 
	 
	 alex.name ="Alexander";
	// mariam.name ="geeta";
	 System.out.println("after changing alex");
	 System.out.println(alex.name + " " + mariam.name);
			 
		}
		static class Person{    
			String name;
			 Person(String name){
				 this.name=name;
			 
			 
		}}
	}
	
