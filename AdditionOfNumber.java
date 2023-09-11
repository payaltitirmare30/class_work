import  java.util.Scanner;

  class  AdditionOfNumber
 {

   //Write a Java program that reads an integer between 0 and 1000
  // and adds all the digits in the integer.
    

   public static void main(String args[])
  {
     Scanner sc  = new Scanner(System.in);

     System.out.println("enter number between 0 and 1000");
     int num = sc.nextInt();

      int sum=0,rem=1;

     while(num!=0)
      {
         rem= num%10;
         sum= sum+rem;
          num = num/10;
       }

     System.out.println("the addition is :"+ sum);
   }

 } 

     