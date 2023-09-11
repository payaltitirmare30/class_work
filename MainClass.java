//WAP in java to implement multilivele inheritance to perform different operations in a string
import java.util.Scanner;
     // Base class
class Parent {
   	 String data;

  	  public Parent(String data) {
   	     this.data = data;
	    }

 	   public void displayData() {
    	    System.out.println("Original Data: " + data);
  	  }
	}

// Intermediate class
class Child extends Parent {
 	  
	 public Child(String data) {
    	    super(data);
  	  }

    	public void calculateLength() {
      	  System.out.println("Length of the Data: " + data.length());
    	}

	public void compare()
	{
	  String s = "hello";
	  System.out.println("Comparing data with s String: "+data.compareTo(s));
	    System.out.println("Comparing s with data String: "+s.compareTo(data));
	}
}

// Derived class
class Grandchild extends Child {

	    public Grandchild(String data) {
  	      super(data);
  	  }

   	 public void convertToUpper() {
      	  System.out.println("Uppercase Data: " + data.toUpperCase());
  	  }

  	  public void convertToLower() {
     	   System.out.println("Lowercase Data: " + data.toLowerCase());
 	   }
}

public class MainClass {
 	   public static void main(String[] args) {

	     String s1= new String();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the string");
	     s1 = sc.nextLine(); 
  	      Grandchild grandchildobj = new Grandchild(s1);

   	     grandchildobj.displayData();
  	     grandchildobj.calculateLength();
	     grandchildobj.compare();
  	     grandchildobj.convertToUpper();
    	     grandchildobj.convertToLower();
    }
}
