/*WAP to get details  of vehicle i.e. Bike and Car.
Override engine() method to describe both bike and car
*/
class Vehicle 
{
        public void engine(){
	System.out.println("this is common engine for all type ");
	}

}
 
class Bike extends Vehicle 
{
	 public void engine(){
	      super.engine();
                       System.out.println("this is bike engine");
	}

}
class Car extends Vehicle
{
	 public void engine(){
	   super.engine();
	   System.out.println("this is car engine");
	}
 }

public class TestDemo
{

	public static void main(String args[]){

	 Vehicle v = new Bike();
	 v.engine();

	 Vehicle v1 = new Car();
	 v1.engine();
	}
}
