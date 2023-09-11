/* WAP to accept Salary from the user and make a decision as per given condition
sal>=50000      print "I am happy"
sal>=75000  print "I have better life"
sal>-=100000 print "My family is happy with me"
*/

import java.util.Scanner;

class  CalSallary 
{
   public static void main(String args[])
   {
        int sallary ;
       Scanner sc = new Scanner(System.in);
        
   System.out.println("Enter your sallary");
    sallary = sc.nextInt();

   if(sallary >= 50000 && sallary <75000)
{
   System.out.println(" I am happy");
}
else if(sallary >=75000 && sallary <100000)
{
System.out.println("I have better life");
}
else if(sallary >=100000 )
{
System.out.println("My family is happy with me");
}
else
{
System.out.println(" Unsatisfied life ");
}

}
}
