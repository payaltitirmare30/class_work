// take chracter input from user

 import java.util.Scanner;
class    CharInput
{
	public static void main(String args[])
	{
	
 	String name;
	char gender;

	Scanner sc = new Scanner(System.in);     

	System.out.println("Enter your name");
	name = sc.nextLine();
	System.out.println("Enter your gender ");
	gender= sc.next().charAt(0);

	 if(gender== 'm' || gender== 'M')
	{ 
	System.out.println("You can do hardwork");
	}
	else if(gender=='f' || gender=='F')
	{
	System.out.println("I am as strong as men but can't do hard work");
	}
	else
	{
	 System.out.println("Please enter correct input !! ");
	}

   	
              }

  }	