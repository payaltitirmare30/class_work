/*Create a method to find the average of all the elements in a LinkedList of integers.
 *Test your method with a sample LinkedList.*/

import java.util.*;
public class CalAverageLikedList {

	double  avg,sum;
	public  double calAverage(LinkedList numlist)
	{
		Iterator<Integer> i = numlist.iterator();
		while(i.hasNext())
		{
			sum += i.next();
		}
		 System.out.println("the sum is :"+ sum);
		 avg = sum /numlist.size();
		   return avg;
	}
	public static void main(String[] args) {
	
		LinkedList<Integer> numlist = new LinkedList<Integer>();
		
		numlist.add(2);
		numlist.add(3);
		numlist.add(4);
		numlist.add(5);
		numlist.add(6);
		
		CalAverageLikedList c = new CalAverageLikedList();
		double avg = c.calAverage(numlist);
		System.out.println("The average is :"+ avg);
	}

}
