import java.util.Scanner;

 class Average
{

 //write a program to calculate average of three numbers

    public static void main(String args[])

{

  double num1, num2, num3;
  double average;

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter first numbers :");
 num1 = sc.nextDouble();
  System.out.println("Enter second numbers :");
 num2 = sc.nextDouble();
  System.out.println("Enter third numbers :");
 num3 = sc.nextDouble();

 average = (num1+num2+num3)/3;
  
System.out.println("the average is: "+average);

}

}