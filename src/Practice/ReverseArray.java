package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int[] array= new int[] {30,8,10,5,55,60,3,6,8,123};
		
		 int size= array.length;
		 int[] reverse =new int[size];
		 int j=0;
		 
		for(int i=(size-1); i>=0; i--){
			
		 reverse[j]= array[i];
		 j++;
		
	}
		System.out.println(" The reverse array is ="+Arrays.toString(reverse));

	}
}