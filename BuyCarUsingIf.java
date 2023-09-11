/* MR.XYZ wants to buy a car of his color choice.But In showRoom there are different colors car available(black,white,Red,blue).
Greet the customer with tha brand and color he purchased.
Basic info(Cust_name,brand,color)
*/

import java.util.Scanner;
class    BuyCarUsingIf
{
	public static void main(String args[])
	{
	 String cust_Name, brand ,color;        //variable declaration

	Scanner sc = new Scanner(System.in);     

	System.out.println("What is your name");
	cust_Name = sc.nextLine();
	
	System.out.println("Which Brand you want ");
	brand = sc.nextLine();


	System.out.println("Which color do you want ");
	color = sc.nextLine();

	if(color.equals("black")
	{
	 System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	}
	else if(color.equals("white")
	{
	 System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	}
	else if(color.equals("red")
	{
	 System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	}
	else if(color.equals("blue")
	{
	 System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	}
	else
	{
	  System.out.println(cust_Name+ " Sorry to say !! The  "+ color+" color Car is not available  ");
	 }

          }

}