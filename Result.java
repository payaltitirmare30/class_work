/*WAP to generate Marksheet of a student based on His personal details and Secured marks.Create PersonalInfo class for accepting student 
personal information and Create another class MarksInfo for Accepting students marks details and finally create Result class to display all above class
 information using multilevel Inheritance.
*/
import java.util.*;

class Base
{

    Scanner sc = new Scanner(System.in);

}

class PersonAllInfo extends Base
 {
           String student_name;
            String college_name;	
           String gender;
           int roll_no;
          
	public void personInput()
	{
	System.out.println("Enter your full name");
	  student_name= sc.nextLine();
	System.out.println("Enter your college name");
	  college_name= sc.nextLine();	  
	System.out.println("Enter your gender");
	  gender= sc.nextLine();
	System.out.println("Enter your roll number");
	  roll_no= sc.nextInt();	  	 
            }

	public void personDetails()
	{
	System.out.println("----------------------------------------");
	System.out.println("Name : "+student_name);
	System.out.println("College Name : "+college_name);
	System.out.println("Roll No : "+roll_no);System.out.println("College Name : "+college_name);
	System.out.println("Gender : "+ gender);
	System.out.println("----------------------------------------");
	}
}

class MarksInfo extends PersonAllInfo
 {
    	 int maths;
  	 int english;
  	 int physics;
    	 int bio;
    	 int chemistry;
	double total;
	double percentage ;
     
         public void marksInput()
	{
	System.out.println("Enter your Maths Marks");
	  maths = sc.nextInt();
	System.out.println("Enter your English Marks");
	  english = sc.nextInt();
	System.out.println("Enter your Physics Marks");
	  physics = sc.nextInt();
	System.out.println("Enter your Biology Marks");
	  bio = sc.nextInt();
	System.out.println("Enter your Chemistry Marks");
	 chemistry = sc.nextInt();	  	 
            }

	public void marksDetails()
	{ 
	 System.out.println("Marks Of each subject out of 100");
	System.out.println("----------------------------------------");
	System.out.println("Maths : "+maths);
	System.out.println("English : "+english);
	System.out.println("Physics : "+ physics);
	System.out.println("Biology: "+ bio);
	System.out.println("Chemistry : "+ chemistry);
	 System.out.println("----------------------------------------");
	 total = maths+english + physics +bio +chemistry ;
	System.out.println("Total :" +total);
	 percentage = (total /500)*100;
	 System.out.println("----------------------------------------");
	 System.out.println("Percentage :" +percentage);
	}
 }

public  class Result
{
    public static void main(String args[])
    {
 	
	MarksInfo stud = new MarksInfo();
	 stud.personInput();
	 stud.marksInput();
 	 stud.personDetails();
	 stud.marksDetails();
   }

}

   






