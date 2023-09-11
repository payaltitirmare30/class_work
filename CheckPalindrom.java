package com.multithreading;

import java.util.Scanner;

/*WAP to implement multithreading for Reversing user input as integer number and reverse that number in one thread and create another thread to check whether that number is palindrome or not
apply proper methods
*/

class ReverseThread extends Thread
{
	  int num;
	  int rem, revNum ;
	  
	ReverseThread(int num)
	{
		this.num = num;
	}
	 
	
	public void run() {
		 
		revNum = reverseNumber(num); // Reverse the number
		 System.out.println(revNum);
	 }
	 
	 private int reverseNumber(int num) {
		 while(num> 0)
		 {
			 rem= num%10;  // Get the last digit
			 revNum= revNum*10+ rem;  //  reversed the number
			 num = num/10;     // Remove the last digit
		 }
		return revNum;
	}

	public int getRevNum()
	{		
		 return revNum;
	 }
	 
}

class IsPalnindrom extends Thread{

	int rev ,num ;
	
	public IsPalnindrom(int num) {
		this.num= num;
		}

	public void run()
	{
		ReverseThread revthread  = new ReverseThread(num); // Create a ReverseThread object 
	    revthread.start();   // Start the reverse thread
	    
	    try {
			revthread.join();  //Wait for the ReverseThread to complete its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rev = revthread.getRevNum(); //Get the reversed number from the ReverseThread
		
		//Check if the original number is equal to the reversed number
		if(num== rev)
		{
			System.out.println("It is palindrome number");
		}
		else
		{
			System.out.println("It is not palindrome number ");
		}
	}
	
}

public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
			
		IsPalnindrom ispal = new IsPalnindrom(num);	
	      ispal.start();
    	
	}

}
