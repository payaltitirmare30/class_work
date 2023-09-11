// WAP to check whether the number is palindrome or not .

import java.util.Scanner;

class PalindromeNum
 {
      public static void main(String args[])
       {	
	int num, temp, rem,rev =0;
         	Scanner sc = new Scanner(System.in);

        	 System.out.println("Enter a number");
       	   num = sc.nextInt();
       	    temp = num;	

       	while (num >0)
    	   {
          	      rem = num %10;
            	      rev = rev * 10 + rem;
            	       num = num / 10;
    	  }
                    
	if( temp == rev )
              	 {
                        System.out.println(temp+" Is Palindrome number");
            	 }
            	 else
             	 {
                         System.out.println(temp+" It is not  Palindrome number");
          	 }
               
            }

  }