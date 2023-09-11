//WAP to find Second largest number in an array
import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
	
		int[] a =new int[5];
	                    Scanner sc = new Scanner(System.in);
	         System.out.println("enter 5 elements ");
	                for(int i=0; i<a.length; i++)
	                {
	                     a[i] = sc.nextInt();
	                 }
		int temp=0;
		for(int i=0; i<a.length; i++) 
		{
		      for(int j=i+1; j< a.length; j++)
		          {
			if(a[i] < a[j])
			   {
	                                       temp =a[i];
			       a[i] = a[j];
		                       a[j]= temp;
			    }
		            }
			System.out.print(a[i]+" ");  
		}
		System.out.println("second largest number is: "+a[1]); 
	}

  }
