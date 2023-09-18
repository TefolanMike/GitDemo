package oops_concep1;

public class WrapperClass {

	public static void main(String[] args) {
	//string into int 
		String x="4500";
		System.out.println(x+100);
		int i=Integer.parseInt(x);
		System.out.println(i+100);

		
		//string to character
		
String l="true";
  boolean o=  Boolean.parseBoolean(l);
  System.out.println(o);
	
	//int to string
  
  int s =100000;
 String p= String.valueOf(s);
  System.out.println(p+100000);
	
	}

}
