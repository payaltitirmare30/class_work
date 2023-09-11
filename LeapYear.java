/*
 Write a Java program that takes a year from the user
 and prints whether it is a leap year or not.
*/
 
import java.util.Scanner;

class LeapYear
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int year ;

              System.out.println("enter a year ");
              year = sc.nextInt();
             
            if( (year %4 ==0 && year%100!=0) || (year%400 ==0) )
             { 
               System.out.println(year +" Is Leap year ");
              }
             else 
             { 
                 System.out.println(year + " Is not leap year");
              }
            
         }
   }