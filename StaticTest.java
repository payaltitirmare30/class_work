class SDemo
{

	int res ;
	public void add(int a, int b){
	  res = a+b;
	System.out.println("the addition of two numbers is :"+ res);
	}

	static  int multiply(int a, int b)
	{
	  return a*b;
	 }

	public double div(int a, int b)
	 {
	   return (a/b);

	 }
}

public class StaticTest
{

	public static void main(String args[])
	 {
	   SDemo obj = new SDemo();
	   obj.add(5,4);
	
	System.out.println("the multiplication is :"+  SDemo.multiply(5,5));

	System.out.println("the multiplication is :"+  obj.div(51,5));
               }
}
