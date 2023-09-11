//WAP to calculate area of rectangle, area of Square and area of circle using method overloading

public class Shape
 {
  
	int areaOfShape( int length, int width )
	{
	    return length * width ;
	}

 	int areaOfShape( int side )
	{    
	    return side * side ;
	}
	double areaOfShape( double radius )
	{
	   return radius * radius*Math.PI ;
	}	

	public static void main (String args[])
	{
	 Shape  shape = new Shape();

	System.out.println("area of rectangle is: "+shape.areaOfShape(5) );
	System.out.println("area of square is: "+shape.areaOfShape(4) );
	System.out.println("area of circle is: "+shape.areaOfShape(5.0) );
	 }

}



	