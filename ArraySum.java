//WAP to accept 5 inputs for two arrays and add them.
import java.util.Scanner;
public class ArraySum
{
	public static void main(String args[]){
	 int i;
	 int [] a1 = new int[5];    //Array declaration 
	 int[]  a2 = new int[5];
	 int[]  c = new int[5];    
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter five values for first array");

	for( i=0; i<5; i++)
	{
	  a1[i] = sc.nextInt();
	}
	System.out.println("enter five values for second array");
	for( i=0; i<5; i++)
	{
	  a2[i] = sc.nextInt();
	}
               
	System.out.println("The sum of two array is: ");
	for(i=0; i<5; i++)
	{
	 c[i] = a1[i]+a2[i];
	 System.out.println(a1[i]+ "+"+a2[i] +" = "+ c[i]); 
	}
        }
}