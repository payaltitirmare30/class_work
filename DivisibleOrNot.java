/*
WAP to accept number from user and check if it is divisible by 5 or not
*/
import java.util.Scanner;

class  DivisibleOrNot
{
   public static void main(String args[])
   {
        int num;
       Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    num = sc.nextInt();

  if(num %5==0  && num%3==0)
{
    System.out.println( num+ "  is  divisible by 5&3");
   }

else 
{
  System.out.println(num + " is not divisible by 5&3");
  }
}
}  