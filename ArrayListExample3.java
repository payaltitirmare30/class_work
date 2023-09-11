//WAP to create arraylist of languages and add running programming languages in that
import java.util.*;

public class ArrayListExample3{

	public static void main(String args[]){
	
	ArrayList<String> languages = new ArrayList<String>();
	languages .add("Java");
	languages .add("C");
	languages .add("Python");
	languages .add("C++");

	String str = languages.get(2);
	System.out.println("element at index 2 "+str );
	//modify arraylist
	languages.set(0,"Core Java");
	System.out.println("Modified arraylist is "+languages );

	//remove particular element
	String str1 = languages.remove(1);
	System.out.println("After removing arraylist is :"+languages);

      }
}