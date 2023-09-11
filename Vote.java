//WAP  to check user is eligible for vote or not 

import java.util.Scanner;

public class Vote
  {

      public static void main(String args[])
      {
            int age ;
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter  your age :");
       age= sc.nextInt();
    
         if (age >=  18)
       {
             System.out.println("Congratulation.. You are Eligible  for vote");
       }
     else 
       {
           System.out.println("Sorry.. You are not  Eligible  for vote");
        }
  }
  
}       
