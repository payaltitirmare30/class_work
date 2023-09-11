//WAP  to check number is positive or not

import java.util.Scanner;

public class IFElse
  {

      public static void main(String args[])
      {
            int num;
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter  a number :");
       num = sc.nextInt();
    
         if(num >0)
       {
             System.out.println("you enter a positive number :"+ num);
       }
     else 
       {
          System.out.println("You enter a negative number :"+ num );
        }
  }
  
}       
