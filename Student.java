/*
WAP that takes Basic information of student and Display the same.Add two more methods in the
 same program which are related to Student class
*/
import java.util.Scanner;

public class  Student
 {
 	String name;
	int rollno;
	int age;
	int percentage ;

 	public void input()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your name :");	
	 name = sc.nextLine();
	  System.out.println("Enter your roll no:");	
	 rollno = sc.nextInt();
	  System.out.println("Enter your age:");	
	 age = sc.nextInt();

	  System.out.println("Enter your percentage :");	
	 percentage  = sc.nextInt();

	}
	
	void info()
	{
	System.out.println("Name:"+ name);
	System.out.println("Roll Number :"+ rollno);
	System.out.println("Age :"+ age );
	}

	public void checkCollegeAdmission()
	{
                     if(age >=18 && age<=25)
	     {
	        System.out.println("Congratulations! " + name + ", you are eligible for college admission.");	
	      }
 	 else {
                         System.out.println(name + ", you are not eligible for college admission yet.");
                      }	
	}

	public void  checkGrade()
	{
                      if(percentage >= 80 && percentage <=100)
	     {
	        System.out.println("you get A grade");
	     }
	    else if(percentage >= 65 && percentage < 80)
	     {
	        System.out.println("you get B grade");
	     }
 	    else if(percentage >= 50 && percentage < 65)
	     {
	        System.out.println("you get C grade");
	     }
	  else 
	    {
 	      System.out.println("you get D grade");
	   }
	}

	public static void main(String args[])
	{
	 Student student = new Student();

	 student.input();
	 student.info();
	 
                   student.checkCollegeAdmission();
                  
	 student.checkGrade();

	}

 }

     