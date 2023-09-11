import java.util.Scanner;
class Parent
{
 	int num;
	
	Parent(int num)
	{
	  this.num= num;
	} 
	void parent()
	{
	System.out.println("parent "+num);
	}
}
class Child extends Parent
{
	Child(int num)
	{
	  super(num);
	}
	void child()
	{
	 System.out.println("child "+num);
	}
}
public class MainTest
{
	public static void main(String[] args)
	{	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int  num = sc.nextInt();

	 Child c = new Child(num);
	 c.parent();
	 c.child();
	}
}
	 