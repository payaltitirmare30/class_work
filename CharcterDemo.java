import java.util.Scanner;
public class CharcterDemo
{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();

	char[] chr = str.toCharArray();
	int sum=0;

	for(int i=0; i<chr.length; i++)
	{
	 sum +=(int)(chr[i]);
	}

	System.out.println("Sum of ASCII codes is "+ sum);
}
}