/*WAP to accept a set of any 10 characters.
 Calculate and print the sum of ASCII codes of the characters.*/

import java.util.Scanner;
public class CalASCII
{
 	   public static void main(String args[]){
  	    Scanner sc = new Scanner(System.in);
                  
	   int sum=0;
   	     char[]  c = new char[10];
	  System.out.println("Enter  10 character ");
		for(int i=0; i<10; i++)
		{
		  c[i] = sc.next().charAt(0); 
		}
    
 	               for(int i=0; i<10;i++)
		{
		 sum += (int)c[i];
		System.out.println("the ASCII code of  "+c[i] + "=" +(int)c[i] );
		}
		 System.out.println("the sum of all character is :"+sum);
	      
	     /* another way of doing the same 
		for(int i=0; i<10; i++)
		{
	 	   char chr = sc.next().charAt(0); 
	  	  System.out.println("ASCII code of "+chr+ " = "+(int)chr);
		  sum += (int)chr;
	                }
		System.out.println("the sum of all character is :"+sum);
	*/
       	 }
}