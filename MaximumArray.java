//Wap to accept five values from user and find maximum value from them.
import java.util.Scanner;
public class MaximumArray
{
	public static void main(String args[]){
	 int i;
	 int max ;   //to store the minimum value
	 int[] a = new int[5];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter five values");

	for( i=0; i<5; i++)
	{
	  a[i] = sc.nextInt();
	}

	max =a[0];   //assigning a[0] value in min variable

	for( i=1; i<5; i++)
	{
	  if(a[i] > max) 
	  {
	    max= a[i];  
	  }
	}
	 System.out.println("the maximum value is:"+ max);
}
}