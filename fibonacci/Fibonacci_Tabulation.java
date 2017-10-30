package fibonacci;

import java.util.Scanner;

public class Fibonacci_Tabulation {
	
	public static long fib(int n)
	{
		int f[] = new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the value of n = ");
		int n = new Scanner(System.in).nextInt(); 
		
		long t = System.currentTimeMillis();
		System.out.println("Fibonacci = " + fib(n) );
		t = System.currentTimeMillis() - t;
		
		System.out.println("Time taken by program = " + t + " ms");
	}

}
