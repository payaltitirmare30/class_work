/*Write a java program to create a class called shape with a method 
called getArea(). Create a subclass called Rectangle that overrides the 
getArea() method  to calculate the area of a rectangle. */
import java.util.Scanner;
class Shape
{
	Scanner sc = new Scanner(System.in);
	public void getArea()
	 {
	    
	 }
}

class Rectangle extends Shape
{	
	 int length , width, area;
	public void getArea()
	 {
	    
	     System.out.println("Enter a length");
	      length = sc.nextInt();

	    System.out.println("Enter a width");
	     width = sc.nextInt();
	 }

	 public void display()
	 {
	     area = length * width;
	   System.out.println("Area of Reactangle is :"+ area);
	}
}

public class AreaRectangle
{
	public static void main(String args[])
	 {
	   Rectangle rect = new Rectangle();
	   rect.getArea();
	   rect.display();
   	 }
}