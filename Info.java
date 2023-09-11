
import java.util.Scanner;

class Info
{

 	String name;
	String address;
	int age;

	 Scanner sc = new Scanner(System.in);
	void tellName()
	{ 
	  System.out.println("Enter your name ");
	 name = sc.nextLine();
	
	 }
	void tellAddress()
	{ 
	  System.out.println("Enter your address");
	  address = sc.nextLine();
	  
	}
	 void tellAge()
	{ 
	  System.out.println("Enter your age");
 	 age = sc.nextInt();
	
	}
	 void display()
	{
	  System.out.println("Your name is :" +name);
	  System.out.println("Your address is :" +address);
	   System.out.println("Your age is :" + age );
	}

	public static void main(String args[])
	{

	 Info obj = new Info();
	 obj.name="payal";
	 obj.address="nagpur";
	 obj.age = 21;

 	System.out.println("Name of the boy is :"+  obj.name);
	System.out.println("Name of the boy is :"+  obj.address);
 	System.out.println("Name of the boy is :"+  obj.age);

	obj.tellName();
	 obj.tellAddress();
	 obj.tellAge();
	 obj.display();
	}
 }