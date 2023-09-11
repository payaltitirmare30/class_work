import java.util.Scanner;

class Dog
 {
	String breed;
	int age;
	String color;
	int time;
	Scanner sc = new Scanner(System.in);

	void accept(){
	 System.out.println("Enter the breed of dog:");
	 breed = sc.nextLine();
	 System.out.println("Enter the age of dog :");
	 age = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter the color of dog :");
	 color = sc.nextLine();

	}

	void diplayInfo(){
	  System.out.println("Dog Breed is "+breed);
	System.out.println(" Dog age is "+age);
	 System.out.println("Dog color is : "+ color);
	 }
	
	void barking(){
	   System.out.println("Whenever see strangers ");
	}
	
	void hungry(){
	    System.out.println("My dog eats meat  ");
	}

	void sleeping(){
	  System.out.println("when your dog sleep  ");
	 time = sc.nextInt();
	  System.out.println("my dog sleep at: "+ time );
	}


	public static void main(String args[])
	{   Dog dog = new Dog();

	  dog.accept();
	dog.barking();
	dog.hungry();
	 dog.sleeping();

	}
}	