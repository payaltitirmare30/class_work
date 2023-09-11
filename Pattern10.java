/* 
*                  *
**               **
***            ***
****        ****
*****    ****
****** ******
******    ******
*****          ****
****              ****
***                   ***
**                        **
*                              *
 */

class Pattern10
{
    public static void main(String args[])
      {
         int n=6;

         for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

	   System.out.println( );
              }
            	
	// Lower half of the butterfly
           for (int i = n; i >= 1; i--) {
          
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
         
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
              System.out.println(); 
           }   
      }
}