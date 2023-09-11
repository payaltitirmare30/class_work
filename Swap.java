import java.util.Scanner;

      //program to swap two numbers

class Swap
    {
          public static void main(String args[])
              {  
                //variable declaration
               int num1, num2, temp;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number:");
             num1 = sc.nextInt();
        System.out.println("enter second number:");
        num2 = sc.nextInt();

   System.out.println("Before swapping num1:"+num1+" and "+"num2 :"+num2);

           temp =num1;
           num1= num2;
           num2= temp;
      
System.out.println("After  swapping num1:"+num1+" and "+"num2 :"+num2);

                }

}