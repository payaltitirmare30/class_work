/*Create a package Empdetails.
Create a class Emp which has fields as 
Empid,Empname,Empdesignation ,Accept details 
from user and display the same  */

package Empdetails;
public class Emp
{
    public int Empid;
    public String  Empname, Empdesignation;
   
    Emp(int eid, String ename, String edesignation)
    {
       Empid = eid;
       Empname = ename;
       Empdesignation = edesignation;
     }

   public void display()
   {
    System.out.println("Employee Id ="+Empid);
     System.out.println("Employee Name ="+Empname);
     System.out.println("Employee Designation  ="+Empdesignation);
   }

}
