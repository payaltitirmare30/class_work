//Check whether the user input number is prime number or not
import java.util.Scanner;

class  CheckPrimeNumber
{

	public static void main(String args[] )
	{
	int num;
	 boolean isPrime= true;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any positive number :");
	 num =  sc.nextInt();

	for(int i =2; i<num ; i++)
	{
	   if(num %i ==0)
	     {
	         isPrime = false;
	          break;
	     }
	  
	}	
	if(isPrime)
	 {
	 System.out.println("it is prime number ");
	}
	 else 
	 {
	    System.out.println("it is not a prime number ");
	 }
	
       }
}
	 