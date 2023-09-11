/*
WAP to print whether the number is positive,negative or zero*/ 

import java.util.Scanner;

class  PosORNeg
{
   public static void main(String args[])
   {
        int num;
       Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    num = sc.nextInt();

  if(num >0 )
{
    System.out.println( num+"  is positive");
   }
else if(num <0)
{
 System.out.println(num+" is negative");
  }
else 
{
  System.out.println(" num  is zero");
  }
}
}  