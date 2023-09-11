/*
Create a class Customer where class varibles are 
(Custname,ProductName,ProductQuantity,TotalAmount )
use appropriate getter setters for the same
*/
 class Customer
 {
	 private String custname;
	 private int productname;
	 private int productquantity;
	  private int totalAmount;
	  private int amount;

	public void setCustName(String custname){
	this.custname = custname;
	}
	public String getCustName(){
	 return custname;
	}
	public void setProductName(int productname){
	this.productname = productname;
	}
	public int getProductName(){
	 return productname;
	}
	public void setProductQuantity(int productquantity){
	this.productquantity = productquantity;
	}
	public int getProductQuantity(){
	 return productquantity;
	}   	

	public void accept() {
              
	System.out.pritnln("Enter your name :");
	custname = sc.nextLine();
	 System.out.pritnln("Enter your product name :");
	 System.out.pritnln("Enter 1:Sugar , 2:salt , 3:perfume, 4:toothpaste");
	productname = sc.nextInt();
	}

	public void price(){

	 switch(productname){

	case 1 :
	       productquantity = 42;
	        System.out.pritnln("how many kg you want :");
	        amount = sc.nextInt();
	        totalAmount = amount * productquantity;
	         System.out.pritnln("The Total amount is :"+totalAmount);
	case 2 :
	         productquantity = 45;
	        totalAmount = productquantity;
	case 3 :
	         productquantity = 250;
	         totalAmount=productquantity ;
	case 4 :
	         productquantity = 100;
	          totalAmount=productquantity ;
	}
       }

	
   }

public class  MainCustomer
{

                  public static void main(String args[]){

         	  Customer customer = new Customer();
	 customer.accept();
	 customer.price();
	
	}
}



