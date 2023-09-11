/*
Create a class father,Son and Baby .
All three classes have a method move .
write specific comment inside that like for father-I can
 walk with the help of stick. 
and for Son I can run fast
and for baby I can Nicely crawl */

class Father
{
	 //method in the superclass
  	 public void move() {
	  System.out.println("This is Father class ");
  	  System.out.println("I can walk with the help of stick.");
   }
}
class Son extends Father 
 {
                 public void move() {
	      //calling father class move 
	     super.move();
	  System.out.println("This is Son class ");
  	  System.out.println("I can run fast.");
   }
}
class Baby extends Son 
 {

                 public void move() {
	  //calling son class move 
	   super.move();
	 System.out.println("This is Baby  class ");
  	  System.out.println("I can Nicely crawl .");
   }
}
public class MainInheritance
{
          public static void main(String args[]) {
           
              Baby obj = new Baby();
               obj.move();
       }

}