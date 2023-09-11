/*
WAP to accept score of two team(say India and Pakistan based on score 
make a decision who won the match
*/
import java.util.Scanner;
class CricketMatch{

            public static void main(String args[])
             {
                       int indiaScore , pakistanScore; 
                     Scanner sc = new Scanner(System.in);
                     System.out.println("Enter team india score");
                      indiaScore = sc.nextInt();

                      System.out.println("Enter team pakistan score");
                      pakistanScore = sc.nextInt();
                       
                       if (indiaScore > pakistanScore )
                        {
                           System.out.println("India is won the match");
                       }
                        else
                           { 
                              System.out.println("pakistan is won the match");
                           }
                  }
}
     