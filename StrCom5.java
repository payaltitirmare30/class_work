import java.util.Scanner;

public class StrCom5
{
	 public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two strings");
  	  String str1= sc.nextLine();
	  String str2= sc.nextLine();

	int i =str1.compareTo(str2);

	System.out.println(i);
	String str3 = str1.toUpperCase();
	  	 
	System.out.println(str3);

	
}
}