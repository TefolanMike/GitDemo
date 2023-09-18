package Practice;

import java.util.Arrays;

public class Fabonacci {

	public static void main (String[]args) {
		
	int[] array= new int[10];
	int sum =0;
		
	for(int i=0;i<10;i++) {
		
		if(i<=1) {
			
		array[i]=sum;
		sum++;
		}
		if(i>1) {
			
		array[i]=array[i-1]+array[i-2];
			
			
		}
		}	
	
	System.out.println("The fabonacci array is ="+Arrays.toString(array));	
		
		
		
		
		
	}
}
