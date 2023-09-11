  //program to calculate simple interest
import java.util.Scanner;

class  Calculateimport java.util.Scanner;
import java.util.Scanner;

class  CalculateInterest
 {

   public static void main(String args[])
  {
       
   Scanner sc = new Scanner(System.in);

    System.out.println("enter principal");
    double principal= sc.nextDouble();

    System.out.println("enter rate");
    double rate= sc.nextDouble();

    System.out.println("enter Time");
    double time = sc.nextDouble();

    double simple_interest =( principal * rate * time)/100;  

    System.out.println("Simple Interest is :" +simple_interest);
 
  }

}
    
 