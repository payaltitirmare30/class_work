import  java.util.StringTokenizer;

public class StringTokenizer3{

	public static void main(String args[]){
	
	StringTokenizer st = new StringTokenizer("Hello Everyone have a nice day"," ");
	 //printing the nu,ber of token present in a string 
	System.out.println("Total number of tokens :"+ st.countTokens());
	
	
}
}