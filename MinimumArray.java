//Wap to accept five values from user and find minimum value from them.
import java.util.Scanner;
public class MinimumArray
{
	public static void main(String args[]){
	 int i;
	 int min ;   //to store the minimum value
	 int[] a = new int[5];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter five values");

	for( i=0; i<5; i++)
	{
	  a[i] = sc.nextInt();
	}

	min =a[0];   //assigning a[0] value in min variable

	for( i=1; i<5; i++)
	{
	  if(a[i] < min) 
	  {
	    min= a[i];  
	  }
	}
	 System.out.println("the minimum value is:"+ min);
}
}