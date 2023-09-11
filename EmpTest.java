/*WAP to implement  hierarchical inheritance .Create a class Employee with
 fields id,name,salary.Create  two more classes PermantEmp and ContractEmp in 
that add hike() method to display percentage hike in the salary.
permantEmployee hike is 10% of the salary and contractEmployee salary will be 
 hiked by 5% of salary   */
import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);

	public void accept()
	{
	  System.out.println("enter employee name ");
	  name = sc.nextLine();
	   System.out.println("enter your employee id");
	   id = sc.nextInt();
 	    System.out.println("enter employee salary");
	 salary= sc.nextDouble();
	}

	
	public void display()
	{
	 System.out.println("Employee Id is :"+ id);
	 System.out.println("Employee name is :"+ name);
	 System.out.println("Employee salary is :"+ salary);
	}

	public void  hike(){
	 
	}
 
}

class PermantEmp extends Employee
{           
			   
	@Override
n	public void  hike(){
	 System.out.println("id is "+super.id);
	 salary = salary + (salary * 0.10);
	 System.out.println("After hike salary is:"+ salary);
	 System.out.println("you are  Permant Employee");
	} 
	
}

class ContractEmp extends Employee
{	 
	 @Override
	public void hike(){
	 salary = salary + (salary * 0.05); 
	 System.out.println("After hike salary is:"+ salary);
	 System.out.println("you are  Contract  Employee");
	}
	
}

class EmpTest{

	public static void main(String args[])
	{
	 
	Employee emp = new Employee();
	 
	 emp.accept();
	// emp.display();

	if(emp.id >=1 && emp.id<=100)
	{
	 PermantEmp pemp = new PermantEmp();
	 // pemp.accept();
	  pemp.display(); 
	  pemp.salary =emp.salary;
	  pemp.hike(); 
	}
	  else
	{
	ContractEmp cemp = new ContractEmp();
	//  cemp.accept();
	 // cemp.display(); 
	  cemp.salary =emp.salary;
	  cemp.hike(); 
	} 
         }

}
	 