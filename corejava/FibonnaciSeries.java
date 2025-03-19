
public class FibonnaciSeries {
	public static void main(String args[]) {
		//Fibonnaci series means sum of previous two numbers 
		int a=0;
		int b =1;
		int c;
		
		for(int i=1; i<=10; i++) {
		
			c = a+b;
			System.out.println("" +c);
			a=b;
			b=c;
			
		}
		
		
}}