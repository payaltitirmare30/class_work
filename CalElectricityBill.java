/*
   Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
1 to 100 units – Rs. 10/unit

·      100 to 200 units – Rs. 15/unit

·      200 to 300 units – Rs. 20/unit

·      above 300 units – Rs. 25/unit
*/

import java.util.Scanner;

class CalElectricityBill
 {
     public static void main(String args[] )
        {
            int unit;

           Scanner sc = new Scanner(System.in);
          System.out.println(" enter  the units "); 
            unit = sc.nextInt();
         
            if(unit>1 && unit <=100)
           {
              System.out.println("your electricity bill is "+unit * 10);
           }
        else  if(unit>100 && unit <=200)
           {
              System.out.println("your electricity bill is "+unit * 15);
           }
         else  if(unit>200 && unit <=300)
           {
              System.out.println("your electricity bill is "+unit * 20);
           }
           else  
           {
              System.out.println("your electricity bill is "+unit * 25);
           }

}

}