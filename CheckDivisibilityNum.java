/* .Write a Java program that takes an integer as input 
and checks if it is divisible by 5 and 11. 
Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.*/

import java.util.Scanner;

class CheckDivisibilityNum
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int num;

              System.out.println("enter a number");
              num = sc.nextInt();
 
              if(num %5==0 && num%11==0)
              {
                System.out.println("Divisible");
              }

               else
             { 
              System.out.println(" Not divisible");
             }

       }
}