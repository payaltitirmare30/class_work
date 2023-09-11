package vehicles;
public class Car5 implements VehicleInt
{
      public void run()
       {
           System.out.println("run method");
        }
        public void speed()
       {
           System.out.println("speed  method");
        }
         public static void main(String args[])
         {
               Car5 c =new Car5();
	c.run();
	c.speed();
         }
}		
	 