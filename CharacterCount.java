/*WAP to input set of N  characters. 
Find and display the number of uppercase and lowercase charachers.
Assume that none of the character is digit or a special character */

import java.util.Scanner;
class CharacterCount
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int upCount=0 , lowCount=0 ,num;
	
	System.out.println("enter how many character you want to print ");
	 num = sc.nextInt();
	System.out.println("Enter "+num+" characters ");
	for(int i=0; i< num; i++){
	   char  ch =  sc.next().charAt(0);

	 if(Character.isUpperCase(ch))
	    { upCount++; }
	 if (Character.isLowerCase(ch)) 
	    { lowCount++; }
	}
	 System.out.println("Number of uppercase characters: " + upCount);
 	 System.out.println("Number of lowercase characters: " + lowCount);
}
}