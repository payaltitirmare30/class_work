import java.util.Scanner;
public class StrCom
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("enter two string");
	String  str1 = sc.nextLine();
	String  str2 = sc.nextLine();
	//0->true 1->false
	int i =str1.compareTo(str2);

	if(i==0)
	{
	  System.out.println("Both the strings are equal");
	}
	else
	{
	  System.out.println("Both the strings are not equal");
	}
}
}