public class TryCatchExample
{
     public static void main(String args[])
      {
          try
            {
              int data =50/0;
              System.out.println("the result is "+data);
             }

           catch(Exception e)
	{
	    System.out.println(e);
	}
	  System.out.println("Welcome to the concept of Exception Handling");

	}
}	