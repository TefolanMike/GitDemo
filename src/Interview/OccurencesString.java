package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurencesString {
	
	public static void main (String[] args) {
		
		String input="ManeeshForGeeks";
		char[] ch= input.toCharArray();
		
		Map<Character,Integer> map1= new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++) {
			
			//for(int j=+1;j<ch.length;j++){
				
				//if(ch[i]==ch[j]) {
				if(map1.containsKey(ch[i])) {
					map1.put(ch[i], (map1.get(ch[i]))+1);
					
				}
				else {
					
					map1.put(ch[i], 1);
				}
			
			 }
				
		for( Entry<Character,Integer> entry : map1.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println("the repeating character is="+ entry.getKey()+":"+entry.getValue());
			}
		}

		
		
	}

}
