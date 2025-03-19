

public class Type2 {
	public static void main(String[] args) {
	
		System.out.println("________NamingVariables_____________");
		int zero = 0;
		int one = 1;
		double pi = 2.1415;
		int subscriberCountForAmigoCode = 1_000_000;
		
		
		//String 
		char a = 'A';
		char b = 'B';
		
		String name = new String("This is our java Application");
		//print uppercase 
		System.out.println(name.toUpperCase());
	   //print lowercase
		System.out.println(name.toLowerCase());
		
		System.out.println(name.charAt(0));
		
		String code= new String("code");
		System.out.println(name.contains(code));
		
		
		//Arithmetic Operator
		System.out.println("_________Arithmetic Operator___________");
		int ten =10;
		int two=2;
		int addition =ten + two;
		
	System.out.println(addition);
		System.out.println(19+34);
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10%3);
		System.out.println(10*4-5+4);
		//Math Operations
		System.out.println("________Math Operations______________");
		System.out.println(Math.abs(-10));
		System.out.println(Math.max(3,10));
		System.out.println(Math.min(6,10));
		System.out.println((int)Math.pow(5,2));
		System.out.println((int)Math.sqrt(25));
		System.out.println(Math.PI);
		
		
		
		System.out.println("_______COmparsion Operators________");
		int khalidAge=18;
		int mariamAge=20;
		 
		System.out.println(khalidAge<mariamAge);
		System.out.println(khalidAge<=mariamAge);
		System.out.println(khalidAge>=mariamAge);
		System.out.println(khalidAge>mariamAge);
		System.out.println(khalidAge==mariamAge);
		System.out.println(khalidAge!=mariamAge);
		
		System.out.println(("_____________LocgicalOperators_________"));
		
		boolean isAdult=true;
		boolean isStudent=true;
		boolean isAmigosCodeMember= true;
		System.out.println(isAdult && isStudent);
		System.out.println(isAdult || isStudent && isAmigosCodeMember);
		System.out.println(isAdult == true);
		System.out.println(!isAdult);
		System.out.println((10 > 8 || 2 <= 2 ) && isAdult && name.contains("M"));
		
		
			}
		}