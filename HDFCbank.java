/*
Amar" is HDFC bank customer his Balance is 25000. 
After  some time He trasfered 11000 amount to his friend "Surya".
Print the current balance and find interest value on that amount with 
interest value 2%  and 12months?
*/


class   HDFCbank

{
   public static void main(String args[])
   {
        double balance=25000, amt_transferred=11000, rate =2 , time=1, interest, Current_balance ;
      
       Current_balance = 25000 - 11000;
System.out.println(" Current balance is : "+Current_balance);

    interest = ( amt_transferred*2 *1)/100 ;    // SI = p*r*t /100;
  
    System.out.println("Interest value is :"+ interest);
  }

}