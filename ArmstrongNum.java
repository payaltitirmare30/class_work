//write a program to check whether the number is armstrong number or not

import java.util.Scanner;

class ArmstrongNum
 {
      public static void main(String args[])
       {	
	int num, temp, rem,sum=0;
         	Scanner sc = new Scanner(System.in);

        	 System.out.println("Enter a number");
       	   num = sc.nextInt();
       	    temp = num;	

       	while (num >0)
    	   {
          	  rem = num %10;
            	 sum = sum + (rem * rem *rem);
            	 num = num / 10;
    	    }
                    
	if( temp == sum)
              	{
                    System.out.println(temp+" Is Armstrong number");
            	 }
            	 else
             	 {
                   System.out.println(temp+" It is not  Armstrong number");
          	   }
               
            }

  }