/* 
 WAP to accept number from the user ,if it is odd find cube of it otherwise
 find square of that number.(Do not accept input as zero)
*/

import java.util.Scanner;

class FindOddEven
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int num ,result=0 ;

              System.out.println("enter a number");
              num = sc.nextInt();
 
             if(  num= =0)
             { 
               System.out.println(" Do not accept input as zero");
              }
            else  if(num %2 ==0)
              {
                       result == num *num;
                System.out.println( result );
              }
             else
             { 
                 result =  num *num *num; 
              System.out.println(result );
               }
            }
         }
   }