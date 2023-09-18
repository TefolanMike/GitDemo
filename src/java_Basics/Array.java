package java_Basics;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Can contain duplicate values
		//miantains sychronised list
		//manintains insertion list
		//allows random access and stores values on basis of index
		ArrayList a=new ArrayList();//index starts with zero
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add('M');
		a.add("Tom");
		
		System.out.println(a.size());
		
		a.remove(4);
		System.out.println(a.size());
		// to print all values form array
		for(int i=0;i<a.size();i++) {
		
		System.out.println(a.get(i));	
		}
		ArrayList<Integer> b =new ArrayList<Integer>();//this is generic array from 1.5 jdk
		
		b.add(12);
		b.add(7);
		// non generic vs generic:
		
		
	}

}
