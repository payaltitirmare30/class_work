/*
WAP to find greates among three using nested if
*/
import java.util.Scanner;

class CheckGreater3
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int  num1, num2, num3 ;

              System.out.println("enter  first number");
              num1 =sc.nextInt();
               
              System.out.println("enter  second number");
              num2 =sc.nextInt();
            
               System.out.println("enter  third number");
              num3 =sc.nextInt();
               
            if(num1>num2  )
             { 
                   if( num1 > num3 )
                       {
                          System.out.println(num1+"is greater ");
                        }
                      else
                        {
                         System.out.println(num2 +" is greater ");
                        }
                     } 
                  else
                        {
                           if( num2 >num3)
                            {
                                 System.out.println(num2+"is greater");
                             }
                            else
                             {
                                System.out.println(num3+"is greater");
                              }         
                        }
              }

     }