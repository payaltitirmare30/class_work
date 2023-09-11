import java.util.*;
public class JavaCollection2{

public static void main(String args[]){

	LinkedList<String> el = new LinkedList<String>();
	el.add("payal");
	el.add("Saurabh");
	el.add("usha");
	el.add("parabh");

	Iterator<String> itr = el.iterator();

	while(itr.hasNext()){
	System.out.println(itr.next());
	}
}
} 