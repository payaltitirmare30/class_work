/*WAP to create basic calculator using switch case 
1.Addition 2.Subtraction 3.Multiplication  4..Division
*/
import java.util.Scanner;
class  Calculator
  {
     public static void main(String args[])
        {
	int ch ;
	double num1=0,num2=0, result;
 	Scanner sc = new Scanner(System.in);
                   
	 System.out.println("Enter number from 1 to 4 to select operation you wants to perform  ");
	 System.out.println(" 1 is for Addition ");
	 System.out.println(" 2 is for Subtraction  ");
	 System.out.println(" 3 is for Multiplication ");
	 System.out.println(" 4 is for Division");

	ch = sc.nextInt();
                   if(ch<=4 && ch>0) {
	System.out.println("Enter first number  ");
	num1 = sc.nextDouble();
	System.out.println("Enter second number  ");
	num2 = sc.nextDouble();
	}
	switch(ch)
	{
	 case 1:
	        result = num1+num2;
	     System.out.println("The Addition is: "+ result);
	     break;   
	 case 2:
	    result = num1-num2;
	     System.out.println("The Subtraction is: "+ result);
	     break;   	
	 case 3:
	     result = num1* num2;
	     System.out.println("The Multiplication is: "+ result);
	     break;   
	 case 4:
	   result = num1/num2;
	     System.out.println("The Division is: "+ result);
	     break;   
	 
	 default:
	     System.out.println("  INVALID INPUT ");
	     break;    
	}      

         }

}    