//WAP to accept Character from user and make a decision whether is vowel or consonent

import java.util.Scanner;

class VowelDemo3
{

	public static void main(String args[])
	{
	 char ch ;
	Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the character ");
	ch = sc.next().charAt(0);

   	switch(ch)
	{

	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	     System.out.println(ch+ " is a vowel ");
	      break;
	default :
	    System.out.println(ch+"  is a consonent ");
	     break;
	}

          }
}