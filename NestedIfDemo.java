
/*
WAP program to accept a number 
and check whether it is less than 100,greater than 50 else greater than 100
*/
import java.util.Scanner;

class NestedIfDemo
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int num;

              System.out.println("enter a number");
              num = sc.nextInt();
             
            if( num < 100 )
             { 
               System.out.println("the entered number is less than 100");
              
                       if( num >50)
                       {
                          System.out.println("the entered number is greater than 50");
                        }
                   } 
                         else
                        {
                        System.out.println("the entered number is greater than 100");
                        }
              }

     }