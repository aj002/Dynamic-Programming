package fibonacci;

import java.util.Scanner;

public class Fibonacci_Iterative 
{
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter the value of n = ");
		int n = new Scanner(System.in).nextInt(); 
		
		long t = System.currentTimeMillis();
		System.out.println("Fibonacci = " + fib(n) );
		t = System.currentTimeMillis() - t;
		
		System.out.println("Time taken by program = " + t + " ms");
	}
}
