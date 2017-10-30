package fibonacci;

import java.util.Scanner;

public class Fibonacci_Memoized {
	
	static long lookup[] = new long[1000];
	
	public static void initialize()
	{
		for(int i=0;i<1000;i++)
		{
			lookup[i] = -1;
		}
	}
	
	public static long fib(int n)
	{
		if(lookup[n]==-1)
		{
			if(n<=1)
			{
				lookup[n] = n;
			}
			else
			{
				lookup[n] = fib(n-1) + fib(n-2);
			}
		}
		return lookup[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialize();
		
		System.out.print("Enter the value of n = ");
		int n = new Scanner(System.in).nextInt(); 
		
		long t = System.currentTimeMillis();
		System.out.println("Fibonacci = " + fib(n) );
		t = System.currentTimeMillis() - t;
		
		System.out.println("Time taken by program = " + t + " ms");
	}

}
