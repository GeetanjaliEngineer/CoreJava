package JavaPractice;

public class FibonacciSeriesUsingRecursion {

	
	static  int a =0, b=1, c;
	public static void main(String[] args) {
	System.out.println(a+" " +b);
 FibonacciSeriesUsingRecursion ob = new FibonacciSeriesUsingRecursion();
 ob.printFib(10);
 
	}
	private void printFib(int i) {
		// TODO Auto-generated method stub
		if(i >= 1)
		{
			c = a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}
}
