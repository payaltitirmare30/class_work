//use of encapsulation and getter setter 

class Info{

  	private String name;

	public String getName()
	{
	 return this.name;
	 }

	public void setName(String name)
	 {
 	   this.name = name;
	}
}

   public class Data1
{
	 public static void main(String args[])
	{

	Info p = new Info();
 	//access private variable and field from another class
	 p.setName("payal");

	System.out.println(p.getName());
	}
}