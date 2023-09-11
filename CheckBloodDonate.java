/*
 Wap to accept age and weight and make a decision whether he can donate a blood or not
If the person is above 18 years of age then use another if statement to check
 if the weight of the person is above 50 or not.
*/
import java.util.Scanner;

class CheckBloodDonate
{
       public static void main(String args[])
          {
             Scanner sc = new Scanner(System.in);
             int age, weight;

              System.out.println("enter your  age");
              age= sc.nextInt();
            
                  System.out.println("enter  your weight");
              weight = sc.nextInt(); 
             
            if( age > 18 )
             { 
                 if( weight >= 50)
                       {
                          System.out.println("you can donate a blood");
                        }
                   else
                        {
                         System.out.println(" you can not donate a blood because your weight is less than 50");
                       }
                  
                   } 
                         else
                        {
                        System.out.println("you can not donate a blood  because your age is  less than 18");
                        }
              }

     }