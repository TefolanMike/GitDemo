package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class countOccuString {
	
	static final int MAX_CHAR = 256;

	public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        getOccurringChar(str);
        
       
                String str1 = "GeeksForGeeks";
                ArrayList<Character> al = new ArrayList<>();
                for (int i = 0; i < str1.length(); i++) {
                    al.add(str1.charAt(i));
                }
                HashMap<Character, Integer> hm = new HashMap<>();
                for (int i = 0; i < str1.length(); i++) {
                    hm.putIfAbsent(al.get(i),
                                   Collections.frequency(al,al.get(i)));
                }
                
                System.out.println(hm);
         
                for (Map.Entry<Character,Integer> e : hm.entrySet()) {
                    System.out.println(
                        "Character is :"+e.getKey()+ " and its count is string is "+ e.getValue());
                }
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
	static void getOccurringChar(String str)
    {
         
        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++) {
           
       count[str.charAt(i)]=count[str.charAt(i)]+1;
      
       System.out.println(count[str.charAt(i)]) ;
        }
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "Number of Occurrence of "
                    + str.charAt(i)
                    + " is:" + count[str.charAt(i)]);
        }
    }
	
	
}
