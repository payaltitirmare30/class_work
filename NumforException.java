/*Write  a Java program that reads a string input from the user. 
Convert the string to an integer using the Integer.parseInt() method. 
Handle the NumberFormatException that can occur if the input cannot be parsed as an integer.
 Display a message indicating that the input is not a valid integer. */

import java.util.Scanner;
public class NumforException
{
	public static void main(String args[]){
	 String name;
	 Scanner sc = new Scanner(System.in);
	  System.out.println("enter a string ");
	input = sc.nextLine();	
	try {	
	int value = Integer.parseInt(input);
	System.out.println( value);
	}
	catch(NumberFormatException e){
	System.out.println(e);
	 System.out.println("indicating that the input is not a valid integer");
	}
}
}

