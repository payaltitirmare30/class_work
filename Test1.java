//WAP to calculate area of rectangle,square and circle using class and object concept

import java.util.Scanner;

class AreaOfAll
  {
	int length, width  , area ,side;
	 double ans,radius;

 	//cal area of rectangle
	 public void areaOfRectangle()
	{
 	  Scanner sc = new Scanner(System.in);
	System.out.println("enter length and width :");
	 length = sc.nextInt();
	width = sc.nextInt();
	   area = length * width ;
	System.out.println("The area of rectangle is:" + area);
	}

	//cal area of square
	 public void areaOfSquare()
	{
 	  Scanner sc = new Scanner(System.in);
	System.out.println("enter sides of square   :"); 
	side = sc.nextInt();
	   area = side * side ;
	System.out.println("The area of Square is:" + area);
	}

  	//cal area of circle
	 public void areaOfCircle()
	{
 	  Scanner sc = new Scanner(System.in);
	System.out.println("enter sides of square   :"); 
	radius = sc.nextDouble();
	   ans = 3.14 * radius * radius ;
	System.out.println("The area of Circle is:" +  ans);
	}

  }

 public class Test1
{
	  public static void main(String args[])
	{
	   AreaOfAll obj = new AreaOfAll();
	
	   obj.areaOfRectangle();

	   obj.areaOfSquare();	 
	 
	  obj.areaOfCircle();

	}
}
