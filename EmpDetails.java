package Empdetails;
import java.util.Scanner;
public class EmpDetails
{
    public static void main(String args[])
     { 
        Scanner sc = new Scanner(System.in);
           int eid;
          String  ename, edesignation;
      System.out.println("Enter employee name ");
       ename = sc.nextLine();
      System.out.println("Enter id ");
       eid=sc.nextInt();
      System.out.println("Enter employee designation ");
      edesignation = sc.nextLine();

      Emp  e = new Emp(eid, ename,edesignation);
      e.display();
}
}


