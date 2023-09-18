package Interview;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SubString {

	public static void main (String[] args) {
		
		//Input: str = “abcc”, K = 2 Output: 2 Explanation: //Given string str of the lowercase alphabet and an integer K, 
		// the task is to count all substrings of length K which have exactly K distinct characters
		
		String str = "aabcdabbcdc";
		//int k;
		
		char[] ch= str.toCharArray();
		 
		 Set<Character> st= new HashSet<Character>();		 
		 
		 for(Character e: ch) {
			 
			 st.add(e);
		 }
		 
		 System.out.println(st.toString());
		 
		 distinct(st);
		}
	
	 static int  distinct(Set<Character>st) {
		 
		 String l= st.toString();
		  char [] con= l.toCharArray();
		  String str= "";
		  int count=0;
		           
		 
		 for(int i=0;i<l.length();i++) {
			 
			 for(int j=i+1; j<l.length();j++){
				 
				 if(con[i]!=con[j]) {
					 
					str= str+con[i]+con[j]; 
					System.out.print("the unique charcaters is "+str);
					count++;
					
				 }
				 
			 }
		 }
		 
		 
		 
		 
		 
		return count;
		
		
		
		
		
	}
}
