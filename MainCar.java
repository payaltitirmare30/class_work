/*WAP to get car details from the  user.
Here properties to display are  brand,modelname,topspeed 
 and write corresponding getters and setters
Atleast two car details should be visible
*/

 class Car
 {
	 private String brand;
	 private String modelname;
	 private int topspeed;

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

   	
 }

public class  MainCar
{

       public static void main(String args[]){
         	
	 Car car = new Car();
	car.setBrand("Toyota");
	car.setModelName("Supra");
	car.setTopSpeed(349);
	
	Car car1 = new Car();
	car1.setBrand("Bugatti");
	car1.setModelName("Chiron");
	car1.setTopSpeed(420 ); 
	
                 System.out.println("Car Brand is:"+car.getBrand());
	 System.out.println("Car ModelName  is:"+car.getModelName());
	 System.out.println("Car Top Speed is:"+car.getTopSpeed());

	 System.out.println("Car Brand is:"+car1.getBrand());
	 System.out.println("Car Model Name is:"+car1.getModelName());
	 System.out.println("Car Top Speed is:"+car1.getTopSpeed());
	
	}


}


