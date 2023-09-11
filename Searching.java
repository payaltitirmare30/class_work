import java.util.Scanner;
public class Searching
{
       public static void main(String args[]){
	 int[] a = new int[10];
            int l=0, h=a.length-1; mid=0;

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 10 numbers :");
           for(int i=0; i<10; i++)
             {
                 a[i] = sc.nextInt();
              }
              System.out.println("enter which element you want to find ");
              find = sc.nextInt();
	while (l <= h) {
            mid = (l + h) / 2;

            if (find == a[mid]) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (find < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (l > h) {
            System.out.println("Element not found.");
        }

    }
}	