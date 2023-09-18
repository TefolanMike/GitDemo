package Practice;

import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= new int[] {12,10,8,13,17,19,34,9};
		
		int n= array.length;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				
				if(array[i]>array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			}
		System.out.println("the sorrted array is ="+Arrays.toString(array));
		System.out.println("the third highest element in the array is ="+array[n-3]);
	}

}
