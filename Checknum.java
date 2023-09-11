//WAP to check whther the number entered by user is greater than 50, less than 50 or more than 100, print correct message accordingly

import java.util.Scanner;

class Checknum {


public static void main(String args[])
{
  int num;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number ");
num = sc.nextInt();

  if(num >50 && num <=100)
 {
    System.out.println("you have entered value greater than 50");
 }
else  if(num > 100)
 {
    System.out.println("you have entered value greater than 100");
 }
else
 {
    System.out.println("you have entered value less than 50");
 }
}
}