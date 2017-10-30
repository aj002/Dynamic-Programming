package fibonacci;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n = ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long t = System.nanoTime();
		for(int i=0;i<=n;i++)
		{
			Fibonacci_Iterative.fib(i);
		}
		t = System.nanoTime() - t;
		System.out.println("Time taken by normal fibonacci function in nanoseconds    = " + t);
		
		t = System.nanoTime();
		for(int i=0;i<=n;i++)
		{
			Fibonacci_Memoized.fib(i);
		}
		t = System.nanoTime() - t;
		System.out.println("Time taken by memoized fibonacci function in nanoseconds  = " + t);
		
		t = System.nanoTime();
		for(int i=0;i<=n;i++)
		{
			Fibonacci_Tabulation.fib(i);
		}
		t = System.nanoTime() - t;
		System.out.println("Time taken by tabulated fibonacci function in nanoseconds = " + t);

	}

}
