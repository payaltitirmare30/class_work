/*
Create a class Person with two private data members name and age .
Perform Encapsulation on these fields
*/
class Person2{

  	private String name;
 	private int age;
	
	public void setName(String name)
	 {
 	   this.name = name;
	}
	public String getName()
	{
	 return this.name;
	 }
	public void setAge(int age)
	 {
 	   this.age = age;
	}
 	 public int getAge()
	{
	 return this.age;
	 }

}

   public class Test2
{
	 public static void main(String args[])
	{

	Person2  p = new Person2();
 	//access private variable and field from another class
	 p.setName("payal");
	 p.setAge(21);

	System.out.println(p.getName());
	 System.out.println(p.getAge());

	}
}