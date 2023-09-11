/*.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/
import java.util.*;

public class EmpList
{

	public static void main(String args[])
	{
	 List<Integer> emp = new ArrayList();

	emp.add(21);
	emp.add(550);
	emp.add(44);
	emp.add(81);

	System.out.println(emp);

	emp.remove(1);

	System.out.println("After removing 1 element :"+emp);
	emp.set(2,777);
	System.out.println("After updation list is  :"+emp);
	
	}
}