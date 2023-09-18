package Practice;

import java.util.Arrays;

public class shiftingZeroes {// in the right 
	
	public static void main(String[] args){

		int[] array= new int[] {1,0,2,3,2,0,0,4,5,1,0,34,0,34,0,5,8,0,912,0};
		int n= array.length;
		zeroesInEnd(array,n);
		System.out.println(Arrays.toString(array));

		}

		static int[] zeroesInEnd(int[] array,int n){
        
		int temp=0;
		for(int i=n-1;i>=0;i--){

		for(int j=i-1;j>=0;j--){
		if(array[j]==0){
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;

		}
		}
		}
		return array;

		}


		

}
