/*
WAP to accept percentage from the user and make a decision as per below condition:
per>=75 distinction
per<75 and per>60 first class
per<60 and per>=45 second class
35 to 45 pass class otherwise fail
*/

import java.util.Scanner;

class   CheckPercentage{


public static void main(String args[])
{

  int percentage;
Scanner sc = new Scanner(System.in);

System.out.println("Enter your percentage ");
 percentage = sc.nextInt();

  if(percentage >= 75)
 {
    System.out.println("  You got Distinction");
 }
else  if(percentage <75  && percentage >= 60)
 {
    System.out.println("You got  First class ");
 }
else if(percentage < 60 && percentage >= 45)
 {
    System.out.println("You got  Second class");
 }
else if(percentage <45 && percentage >=35 )
{
   System.out.println("  You just  Pass");
}
else 
{
System.out.println("You fail");
}


}
}