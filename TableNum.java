/*
 WAP to accept number from user and generate table of it.
*/
import  java.util.Scanner;
  class TableNum
{
     public static void main(String args[])
      {
        int num ;   
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
         num = sc.nextInt();

       System.out.println("table of "+num +"is :");
        for(int i=1; i<= 10; i++)
         {
           System.out.println(num +"*"+i+ "="+ num *i);
          }
       }
 }  