//wap to make decision which day of week is selected by user as week-off.

import java.util.Scanner;
class  WeekOffDemo 
  {
     public static void main(String args[])
        {
	int ch;
 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number from 1 to 7 to select your weekly off");
	ch = sc.nextInt();
	
	switch(ch)
	{
	 case 1:
	     System.out.println("your weekly off is MONDAY!!! ");
	     break;   
	 case 2:
	     System.out.println("your weekly off is TUESDAY!!! ");
	     break;   	
	 case 3:
	     System.out.println("your weekly off is WEDNESDAY!!! ");
	     break;   
	 case 4:
	     System.out.println("your weekly off is THURSDAY!!! ");
	     break;   
	 case 5:
	     System.out.println("your weekly off is FRIDAY!!! ");
	     break;   
	 case 6:
	     System.out.println("your weekly off is SATURDAY!!! ");
	     break;   
	 case 7:
	     System.out.println("your weekly off is SUNDAY!!! ");
	     break;       
	 default:
	     System.out.println("No WEEKLY OFF TO YOU as INVALID INPUT ");
	     break;    
	}      

         }

}    