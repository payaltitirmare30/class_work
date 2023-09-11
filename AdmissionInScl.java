 /*  
      program for take marks from user and check that 
  if eng, maths and science >=80  pure science
   eng and science >=80, maths >=60 bio science
  eng, maths and science >=60 commerce 
*/

  import java.util.Scanner;

 class   AdmissionInScl
  {

   // variable declaration    
    public static void main(String args[] ) 
     {

     int eng, maths , science ;
   Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter  your English marks");
    eng = sc.nextInt();
   System.out.println("Enter  your science marks");
    science =  sc.nextInt();
   System.out.println("Enter  your maths marks");
    maths = sc.nextInt();

   if(eng >=80 && maths >=80 && science>=80)
    {
        System.out.println(" Eligiable for pure  Science");
    }
 else if( eng >=80 && science >=80  &&  maths >=60)
  {
     System.out.println(" Eligiable  for Bio Science ");
 }
    else if (  eng >=60 && science >=60  &&  maths >=60)
{
   System.out.println(" Eligiable  for commerce ");
 }
else 
{
   System.out.println(" You are not eligible ");
}

  }
     }




















