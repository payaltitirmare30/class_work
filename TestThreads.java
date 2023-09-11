package com.multithreading;
/*Write a JAVA program which will generate the threads:
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/

class FibonacciNum extends Thread{
	
	int firstNum=0,secondNum=1,nextNum;
	int num =10;
	public void run()
	{
		System.out.println("fibonacci series of 10 numbers is :");
		for(int i=1; i<=num; i++ ) {
		
			System.out.print(firstNum+" ");
			nextNum= firstNum + secondNum; // Calculate the next fibonacci number
			firstNum = secondNum;     // assigning secondNum value to firstNum
			secondNum = nextNum;       // assigning nextNum value to secondNum  
		}
		System.out.println(); 
	}
		
}

class ReverseNum extends Thread{
	
	public void run()
	{
	  System.out.println("The Reverse numbers between 1 to 10 :");	
		for(int i=10; i>=1; i--)
		{
			System.out.println(i); //printing i value
		}
		
	}
}
public class TestThreads  {

	public static void main(String args[])
	{
		FibonacciNum fibo = new FibonacciNum();
				
		ReverseNum rev = new ReverseNum();
		fibo.start();  // Start the FibonacciNum thread
		rev.start();   // Start the ReverseNum thread
	}
	
}
