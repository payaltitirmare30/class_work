package MCA;
import java.util.Scanner;
public class StudInfo 
{
	public static void main(String args[]){
	int rollNo;
	String name;
	int m1,m2,m3;
	 Scanner sc = new Scanner(System.in);     	  
	 System.out.println("enter your name");
      	 name = sc.nextLine();
      	 System.out.println("enter your roll number");
       	rollNo = sc.nextInt();
  
	  System.out.println("enter 3 subject marks ");

	 m1=sc.nextInt();
	  m2=sc.nextInt();
	  m3=sc.nextInt();
	Students s = new Students(rollNo,name,m1,m2,m3);
	s.display();
      }
}