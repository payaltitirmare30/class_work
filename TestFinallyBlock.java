public class TestFinallyBlock
{
        public static void main(String args[]){
	try{
	   System.out.println("Inside try block ");
	   int data = 25/0;
	    System.out.println(data);
	  }
	  //cannot handel arithmetic type.
	catch(NullPointerException e){
	   System.out.println(e);
	  }

	finally{
	   System.out.println("Finaaly block is always executed ");
	   System.out.println("This is compulsory executed block irrespective of Exception");
	     }
}
}

	  