//WAP to add two numbers using class and object concept
import java.util.Scanner;

class AdditionOfNum
{
	int num1,num2,sum;

	public void accept()
	{
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter first number ");
	 num1 = sc.nextInt();

	 System.out.println("Enter second  number ");
	 num2 = sc.nextInt();
	}

             /*
	 public void add()
	{
	  sum = num1+ num2;
	  System.out.println("the sum of two numbers is :"+ sum);
	}
             */
	public int add()
	{
	  sum = num1+ num2;
	   return sum; 
	}

	public static void main(String args[])
	{

	AdditionOfNum obj = new AdditionOfNum();
	obj.accept();
	 System.out.println("the sum of two number is :"+ obj.add());
	}
  }