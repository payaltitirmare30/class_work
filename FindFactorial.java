/* Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. 
The program should display the factorial as the output.
*/

import java.util.Scanner;

class FindFactorial
 {
      public static void main(String args[])
       {	
	long num, fact =1, i=1;
         	Scanner sc = new Scanner(System.in);

        	 System.out.println("Enter a Positive number");
       	   num = sc.nextInt();
       	    
       	while (i <= num)
    	   {
          	      fact=  fact * i;
            	        i++;
    	  }
                    
                       System.out.println("Factorial of  "+num+" is "+ fact );
          	 
            }

  }