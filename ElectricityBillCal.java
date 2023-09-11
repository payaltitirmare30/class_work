
import java.util.Scanner;

public class ElectricityBillCal
 {
      public static void main (String args[] )
      {
          int unit, totalBill;
          Scanner sc = new Scanner(System.in);   
        System.out.println("enter your unit");
          unit = sc.nextInt();

            if(unit <=100 )
             {
              totalBill = unit * 10; 
 
             }
            else if(unit <=200)
             {
               totalBill = 100 * 10  +(unit - 100) *15;
 
             }
           else if(unit <=300)
            {
               totalBill = 100 * 10+ 100*15+(unit - 200)*20;
                }
            else
            {
                totalBill = 100*10 + 100* 15+100*20+ (unit-300) *25;
            }
         System.out.println("your bill is :"+ totalBill);    
     }

  }      
      