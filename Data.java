//use of private keyword

class Person2{

  	private String name;
}

   public class Data
{
	 public static void main(String args[])
	{

	 Person2 p = new Person2();
 	//access private variable and field from another class
	 p.name="payal";

	 //error :- name has private access in Person2 class

	}
}