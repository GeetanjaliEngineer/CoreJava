package Loops;
public class FibonnaciusingRecursion {
	static int a=0, b=1, c;
	public static void main(String[] args) {
		//sum of two previous numbers == fibonnaci series 
		System.out.println(a+" " +b);
		FibonnaciusingRecursion ob = new FibonnaciusingRecursion();
		ob.printFib(10);
	}
	void printFib(int i)
	{
		if(i>=1) {
			c=a+b;
			 System.out.println(" "+c);
			 a=b;
			 b=c;
			 printFib(i-1);
		}
		
	}

}
