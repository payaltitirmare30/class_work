import java.util.Scanner;
//program to calculate total salary of Employee

class CalGross
{

 public static void main(String args[])
  {  //variable declaration
      int basicSal;
      float da;
      double hra, gross;
   
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your basic sallary");
  basicSal = sc.nextInt();

 System.out.println("enter your daily allowance");
  da= sc.nextFloat();

System.out.println("enter your hra");
  hra= sc.nextDouble();

gross = basicSal + da + hra;
System.out.println("The gross is:" +gross);

}
}

  