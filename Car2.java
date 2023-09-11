/*WAP to get car details from the  user.
Here properties to display are  brand,modelname,topspeed 
 and write corresponding getters and setters
Atleast two car details should be visible
*/
import java.util.Scanner;
public class Car2
 {
	 private String brand;
	 private String modelname;
	 private int topspeed;

	  Scanner sc = new Scanner(System.in);

	public void setBrand(String brand){
	this.brand = brand;
	}
	public String getBrand(){
	 return brand;
	}
	public void setModelName(String modelname){
	this.modelname = modelname;
	}
	public String getModelName(){
	 return modelname;
	}
	public void setTopSpeed(int topspeed){
	this.topspeed = topspeed;
	}
	public int getTopSpeed(){
	 return topspeed;
	}

	public void display()
	{
	 
	  System.out.println("Enter your brand name");
	  brand = sc.nextLine();

	   System.out.println("Enter your model  name");
	  modelname = sc.nextLine();

	    System.out.println("Enter your top speed");
	  topspeed = sc.nextInt();
	 
	}
	
   	 public static void main(String args[]){
         	 Car2 car = new Car2();

	 car.display();

                   System.out.println("Car Brand is:"+car.getBrand());
	 System.out.println("Car ModelName  is:"+car.getModelName());
	 System.out.println("Car Top Speed is:"+car.getTopSpeed());

	  Car2 car1 = new Car2();
	 car1.display();

                   System.out.println("Car Brand is:"+car1.getBrand());
	 System.out.println("Car ModelName  is:"+car1.getModelName());
	 System.out.println("Car Top Speed is:"+car1.getTopSpeed());

	
	}

 }