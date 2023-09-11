import  java.util.StringTokenizer;

public class Simple2{
	public static void main(String args[]){
	
	StringTokenizer st = new StringTokenizer("my,name,is,sam");
	 //printing single token
	System.out.println("Next token in :"+ st.nextToken(","));
	 System.out.println();
	 //printing all tokens 
	while(st.hasMoreTokens()){
	    System.out.println(st.nextToken());
	}
}
}