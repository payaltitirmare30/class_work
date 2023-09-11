/* Accept array of integer with size 10 .
Take data from user .Ask user to search an element and find 
whether that element is present in the given arrray or not .
If present then mention index number as well  */
import java.util.Scanner;
//-----Linear Search------
public class LinearSearch
{

       public static void main(String args[])
        {

           int[] a = new int[10];
            int find,i=0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 10 numbers :");
           for( i=0; i<10; i++)
             {
                 a[i] = sc.nextInt();
              }

            System.out.println("enter which element you want to find ");
            find = sc.nextInt();

	for( i=0; i<10; i++)
	{
	   if(find ==a[i]){
	        System.out.println("element found at index :"+ i);
		 break;
                           }	   
	}
	 if(i==10)
	  {
	        System.out.println("element Not found ");
	  }	   
        }
}