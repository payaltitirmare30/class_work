
/*
 WAP to  calculate interest rate of Fixed deposite or Saving intertest based on choice provided by user whether he wants to keep money for fixed deposite or saving .
Interest Rate for fixed Deposit is 7 % and for saving it is 3.5%
*/
import java.util.Scanner;
class    CalInterestRate2
{
	public static void main(String args[])
	{
	 double principal, year  ,SI=0;
	 String choice;
	Scanner sc = new Scanner(System.in);     

	System.out.println("Enter your choice!! you want to deposite  or  saving ");
	choice = sc.nextLine();

	System.out.println("Enter the amount of money you want to deposit");
	principal = sc.nextDouble();

	System.out.println("Enter for how many years you want to kept the amount");
	year = sc.nextDouble();
	
	switch(choice)
	{

	case "saving":
	             SI = (principal * year * 3.5) / 100;
	               System.out.println("Interest rate of saving interest is :"+SI);
	            break;

	case "fixed deposite":
	             SI = (principal * year * 7) / 100;
	               System.out.println("Interest rate of fixed deposite interest is :"+SI);
	            break;
 	  default:
 	       System.out.println("Sorry!! please Enter Correct Choice ");
	        break;
	}

           }

}

