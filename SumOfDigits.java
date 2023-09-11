//WAP a program to accept numbers from user and find sum of digits

 import java.util.Scanner;

 class  SumOfDigits
{
     public static void main(String args[])
      {    
        int num , sum =0, rem;
         Scanner sc = new Scanner(System.in);

          System.out.println( "Enter a number ");
            num = sc.nextInt();

         while( num > 0)
           {
                rem = num %10;
                sum = sum + rem;
                num = num / 10;
              
            }
        System.out.println("The sum of digits is   "+ sum);
       }
 } 