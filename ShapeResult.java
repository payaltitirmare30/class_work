/*
WAP to calculate area of rectangle, area of Square and area of circle using method overloading
*/
class Rectangle 
 {
  
	int areaOfShape( int length, int width )
	{
	    return length * width ;
	}
}
class Square extends Rectangle 
{

 	int areaOfShape( int side )
	{    
	    return side * side ;
	}
}
class Circle extends Square
{
	double areaOfShape( double radius )
	{
	   return radius * radius*Math.PI ;
	}	
}
public class ShapeResult
{
	public static void main (String args[])
	{
	  Circle c = new Circle ();

	System.out.println("area of rectangle is: "+c.areaOfShape(5) );
	System.out.println("area of square is: "+c.areaOfShape(4) );
	System.out.println("area of circle is: "+c.areaOfShape(5.0) );
	 }

}



	