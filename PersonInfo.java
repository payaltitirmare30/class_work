import java.util.Scanner;

class PersonInfo
{
	int id;
	String name;

	public void accept()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your name and id");

	 name = sc.nextLine();
	 id = sc.nextInt();

	}
 	public void display()
	{
	System.out.println("YOU ARE WELCOME TO THE ORGANIZATION !!!" +name +" your id is "+ id);
	}

	public static void main(String args[])
	{

	PersonInfo obj = new PersonInfo();
	obj.accept();
	obj.display();

	}
  }