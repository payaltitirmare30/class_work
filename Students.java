/*Write a Package MCA which has one class Student. 
Accept student detail through parameterized constructor. 
Write display () method to display details. 
Create a main class which will use package and calculate total marks and percentage.
*/
package MCA;
public class Students
{
       public  int rollNo;
       public String name;
     public int a,b,c;
       int sum =0;
       Students(int rollNo, String name,int m1, int m2, int m3 )
          {
              this.rollNo = rollNo;
              this.name = name;
               a=m1;
	b=m2;
	c=m3;	
         }
       	 public void display()
	{
	System.out.println("your name is :"+ name);
	System.out.println("your roll number is :"+ rollNo);
	System.out.println("---------Marks ---------");
	System.out.println("sub1 ="+a);
	System.out.println("sub1 ="+b);
	System.out.println("sub1 ="+c);
	 sum = a+b+c;
	System.out.println("total ="+sum);
	System.out.println("percentage ="+sum/3);
	}
}

       