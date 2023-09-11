/*1)Creating a linked list using the LinkedList class add programming languages
2)Adding elements to the list in multiple ways i.e. direct add and adding elements to specific index 
Accessing elements of linked list using get() and set()
How to remove the elements of the linked list */
/*1)Creating a linked list using the LinkedList class add programming languages
2)Adding elements to the list in multiple ways i.e. direct add and adding elements to specific index 
Accessing elements of linked list using get() and set()
How to remove the elements of the linked list */
import java.util.*;
public class ColLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> languages = new LinkedList<String>();
		
		languages.add("java");
		languages.add("c");
		languages.add("python");
		languages.add("c++");
		languages.add("ruby");
		
		System.out.println("the 0 element is  "+ languages.get(0));
		
		languages.set(3, "javascript");
		
		System.out.println("the list after modifying 3 index is :"+ languages);
		
		String s = languages.remove(1);
		System.out.println("removed element is :"+ s);
		System.out.println("the list after removing is :"+ languages);	
		
		for(int i=0; i<languages.size(); i++)
		{
			System.out.println("index :"+ i+"  "+languages.get(i));
		}

		
	}

}
