/* 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21   */

class Pattern9
{
    public static void main(String args[])
      {
 
          int i, j;
          int num=1;   	
          for(i =1; i<=6; i++)
	{
	  for(j=1 ; j<=i ; j++)
	    {
	      System.out.print( num + " ");
	        num++;
	    }
	   System.out.println( );
              }
      }
}