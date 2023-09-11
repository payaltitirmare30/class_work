/*create a class Shape with fields length,breadth,radius
 and other two classes rectangle and Circle extending from 
that Shape class.Apply other methods to calculate area of 
rectangle and circle	*/

class Shape
{
	int length;
	int breadth;
	double radius;

	/*Shape(){
	         this.length = 2;
	         this.breadth = 4;
	         this.radius = 5;
	    } */

}
class Rectangle extends Shape
{
              Rectangle(int length, int breadth)
	{
	  super.length = length;
	  super.breadth = breadth;
	} 

	void calArea()
	{
	  System.out.println("the area of rectangle is:" +length *breadth);
	}
}
class Circle extends Shape
{
             /*  Circle(double radius)
	{
	  super.radius = radius;
	} */

	void calArea()
	{
	  System.out.println("the area of circle is:" +3.14*radius *radius);
	}
}
public class TestShape
{
	public static void main(String args[])
	{
	 Rectangle r = new Rectangle(2,2);
	 r.calArea();
	 Circle c = new Circle();
	  c.calArea();

	}
}