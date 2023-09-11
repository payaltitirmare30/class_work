/* MR.XYZ wants to buy a car of his color choice.But In showRoom there are different colors car available(black,white,Red,blue).
Greet the customer with tha brand and color he purchased.
Basic info(Cust_name,brand,color)
*/

import java.util.Scanner;
class    BuyCar
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

	switch(color)
	{

	case "black":
	     System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	       break;

	case "white":
	      System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and  Brand is "+brand);
	      break;

	case "red":
	      System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	      break;

	case "blue":
	     System.out.println(cust_Name+ "  Congratulations !! you purchased your dream car of "+ color+" color and Brand is "+brand);
	      break;

 	default:
 	       System.out.println(cust_Name+ " Sorry to say !! The  "+ color+" color Car is not available  ");
	        break;
	}
           }

}

