//Wap to get sum of an array accept 7 elments from user
import java.util.Scanner;

public class SumOFArray
{
	public static void main(String args[])
	 {
	   int[]  a = new int[7];
	    int sum =0;
	     float avg;
	Scanner sc = new Scanner(System.in);

	 System.out.println("enter seven elements ");
	 for(int i=0; i< a.length; i++)
	 {
	   a[i] = sc.nextInt();
	 }

	  for(int i=0; i<a.length; i++)
	 {
	   sum = sum + a[i];
	 }
	System.out.println("the sum of array is:" + sum);

	 avg = sum /7.0f;
	 System.out.println("the average  of array is:" + avg);

      }

}
