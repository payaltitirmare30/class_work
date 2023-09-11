//WAP to sort an array in ascending order
import java.util.Scanner;
public class AscendingArray
{
          	public static void main(String args[])
	 {

	  int i,j, temp=0;
	int[] a = new int[5];
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter five elements ");   
	  for( i=0; i<5 ; i++)
	  {
	    a[i] = sc.nextInt();
	  } 
 
	   System.out.println("The ascending order elements are"); 
                  for(i=0;i<5;i++)
	  {
	     for(j=i+1; j<5; j++)   
	    {
	       if(a[i] > a[j]){
	       
	       temp = a[i];
	       a[i] = a[j];
	       a[j] = temp;
	       }
	     }
	  System.out.println( a[i]);  
	 }	  
	  /*  for(i=0; i<5; i++)
	    {
	      System.out.println(a[i]);
	  } */
      }
}