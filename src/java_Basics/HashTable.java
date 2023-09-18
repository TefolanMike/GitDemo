package java_Basics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable();
		
		h.put("A", "Test");//key and value 
		h.put("B", "hELLO");
		h.put("C", "wORLD");
		
	System.out.println(h.size());
	h.put(1, 100);
	h.put(2, 100);
	System.out.println(h.size());
	System.out.println(h.get("C"));
	
	h.put(3, "Tom");
	h.put("Ganesh", 1);//we can put any combination of values
	System.out.println(h.get(3));
	
	Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
	h1.put(3, 300);
	h1.put(4, 400);
	
	Hashtable<Integer,String> h2= new Hashtable<Integer,String>();//can give any combination
	h2.put(1, "Maneesh");
	System.out.println(h2.get(3));
	
	}
	
	

}
