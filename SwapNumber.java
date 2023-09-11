import java.util.Scanner;

      //program to swap two numbers without using third variable

class SwapNumber
    {
          public static void main(String args[])
              {  
                //variable declaration
               int num1, num2;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number:");
             num1 = sc.nextInt();
        System.out.println("enter second number:");
        num2 = sc.nextInt();

   System.out.println("Before swapping num1:"+num1+" and "+"num2 :"+num2);

          num1 = num1+num2;
          num2 = num1-num2;
          num1 = num1 -num2;
      
System.out.println("After  swapping num1:"+num1+" and "+"num2 :"+num2);

                }

}