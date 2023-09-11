/*
WAP to accept three numbers from users and make a desicion which is the greatest number among three
*/ 
import java.util.Scanner;

class  MaxNum
{
   public static void main(String args[])
   {
        int num1, num2, num3;
       Scanner sc = new Scanner(System.in);
        
   System.out.println("Enter First number ");
    num1 =sc.nextInt();
  System.out.println("Enter Second number ");
    num2 =sc.nextInt();
  System.out.println("Enter Third number ");
    num3 =sc.nextInt();

       if(num1> num2 && num1 >num3)
      {
      System.out.println("num1 is greater :"+ num1);
       }
       else if(num2 > num3)
        {
       System.out.println("num2 is greater :" +num2);
        }
       else 
        {
        System.out.println("num3 is greater :"+ num3);
        }

     }

   }