import java.util.Scanner;

class baceClass{

	double balance= 50000 ;
	double amount ;
               Scanner sc = new Scanner(System.in);
    

 }
class Derived extends baceClass{

	public void withdraw(){
   
		System.out.println("You Are Current Balance Is: "+balance);
	   	System.out.print("Enter the amount to withdraw: ");
	   	amount = sc.nextDouble();

	   if ( amount > 0 && amount <=balance ){
	        balance = balance - amount;
	     	System.out.println("withdraw successfully ");
	       	System.out.println("your total balance is : "+ balance);
	    	}
		else{
	   		System.out.println("Insufficient balance");
	 		}
		} 

	public void deposit(){
	    System.out.println("Enter the amount to deposit: ");
	    amount = sc.nextDouble();
	     if(amount > 0)
	    {
	       balance = balance + amount;
	       System.out.println("Deposit successfully ");
	       System.out.println("your total balance is : "+ balance);
	    }
	   	else{
	     	System.out.println("Invalid deposit amount ");
	    	}
	  
		}


}

public class InheritBank{

	public static void main(String[] args) {

		Derived dv=new Derived();
		dv.withdraw();
		dv.deposit();

	}
}