//WAP to search a particular element in the given array.
import java.util.Scanner;
public class Serching
{
            public static void main(String args[])
	{
	  int i , search ;
	  boolean find =false;
	  int[] arr = {22,34,55,66,22};
	  Scanner sc = new Scanner(System.in);

	System.out.println("enter numer you want to find ");
	 search = sc.nextInt();

	for( i=0; i<arr.length; i++)
	{
	   if(arr[i]== search )
	   {
	      find= true;
	      System.out.println("element found at "+ i +" index");
	     break;
	   }
	}
	  if(find)
	    System.out.println("element found ");
	  else
	  System.out.println("element NOT found ");
        }
}