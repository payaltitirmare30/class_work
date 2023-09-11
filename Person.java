/*
WAP to create a class Person with Data members as ubique_id,name,age,city and gender 
also include methods study() sleep() and play()
*/
import java.util.Scanner;
class Person
 {
	int unique_id;
	String name;
	int age;
	String city;
	String gender;
	int study_time;
	int sleep_time;
	String game;
	 Scanner sc = new Scanner(System.in);
	public void accept()
	{
	
	 System.out.println("Enter your name:");	
	 name = sc.nextLine();
	  System.out.println("Enter your unique Id:");	
	 unique_id= sc.nextInt();
 	 System.out.println("Enter your age:");	
	 age = sc.nextInt();
	sc.nextLine();
	 System.out.println("Enter your city:");	
	 city = sc.nextLine();
	 System.out.println("Enter your gender :");	
	 gender = sc.nextLine();
	 System.out.println("your name is"+ name);	
	 System.out.println("your id is"+ unique_id);
	 System.out.println("your age is"+ age);
	 System.out.println("your city is"+ city );
	}
	
	public void study()
	{
	   System.out.println("Enter how many hours you study !");
	   study_time = sc.nextInt();
	   System.out.println(name+"you  study for "+ study_time+" hour");
	  
	}

	public void sleep()
	{
	System.out.println("Enter when you sleep !");
	   sleep_time = sc.nextInt();
	   System.out.println("your sleeping time is "+sleep_time);
	  
	}
 		
	public void play()
	{
	  sc.nextLine();
	 System.out.println("Enter which game you play !");
	   game = sc.nextLine();
	   System.out.println("you play "+ game );
	  
	}

	public static void main(String args[])
	{
	 Person obj = new Person();
	 
	obj.accept();
	obj.study();
	obj.sleep();
	obj.play();

	}
}