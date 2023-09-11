import java.util.Scanner;

class  SimpleInterest
 {

  //program to calculate simple interest

   public static void main(String args[])
  {
       double principal ,rate ,time, simple_interest ;
 
       Scanner sc = new Scanner(System.in);

       System.out.println("enter principal");
       principal = sc.nextDouble();

      System.out.println("enter rate");
      rate = sc.nextDouble();

     System.out.println("enter Time");
     time = sc.nextDouble();

      simple_interest =( principal * rate * time)/100;  

      System.out.println("Simple Interest is :" +simple_interest);
 
  }

}
    