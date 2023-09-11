/*Create a program in java to implement multilevel inheritance and hierarchical inheritance.
   Take classes like: Doctor, Surgeon and Nurse */
      // multilevel inheritance used
class  Doctor
{
    	public void hospital()
	{
	 System.out.println(" This is doctor ");
	}
}

class Surgeon extends Doctor 
{
 	public void hospital()
	{
	 super.hospital();
	 System.out.println(" This is Heart Surgeon ");
	}

	 public void aboutSurgeon()
	{
	 System.out.println(" This is very expensive Surgeon ");
	}

}

class Nurse extends Surgeon
{
	public void hospital()
	{
	 super.hospital();
	 System.out.println(" This is a nurse  ");
	}
}

public class Hospital
{

	public static void main(String args[])
	 {
	    Nurse hos = new Nurse();

	  hos.hospital();
	  hos.aboutSurgeon();

	}
	
} 