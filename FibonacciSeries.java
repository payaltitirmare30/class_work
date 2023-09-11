// fibonacci series 0   1    1    2  3     5   8

import java.util.Scanner;
  class FibonacciSeries
{
     public static void main(String args[])
      {
           int  num ,a= 0 , b=1, sum;

           Scanner sc = new Scanner(System.in);
           System.out.println("enter a number");
           num = sc.nextInt();

          System.out.println("The Fibonacci Series is:");
         
          System.out.print( a +","+ b+",");
       
          for(int i=1; i<= num; i++)
          {
            sum = a+b;
             System.out.print( sum+",");
             a=b;
             b = sum; 
           }
       }
 }  