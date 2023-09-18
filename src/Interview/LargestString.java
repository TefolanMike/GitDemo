package Interview;

import java.util.ArrayList;
import java.util.Arrays;

//Length of the longest substring without repeating characters
public class LargestString {

	public static void main (String [] args) {
		
		
		String sample = "GEEKSFORGEEKS";
		char[] ch = sample.toCharArray();
		int m= sample.length();
		
		ArrayList<Character> ar = new ArrayList<Character>();		
		
		for( int i =0; i <m; i++) {
			
			String[] breakage= sample.split(sample, sample.charAt(i));
			
			System.out.println(breakage[i]);
			
//			for(int j=0;j<breakage.length;j++) {
//				
//				if(breaka)
				
				
				
			}
			
//			for(int j=i+1; j<m;j++) {
//				if(ch[i]!= ch[j]) {
//					
//					ar.add(ch[i]);
//				}
//			}
//			
//		}
//		
		//System.out.println(Arrays.toString(ch));
	}
}
