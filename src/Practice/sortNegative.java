package Practice;

import java.util.Arrays;

public class sortNegative {
	static void  reversenegative(int[] array){



		int j=0,temp;

		for(int i=0;i<array.length;i++){
		 
		if(array[i]<0){
		 if(i!=j){
		 temp=array[i];
		 array[i]=array[j];
		 array[j]=temp;
		}
		j++;
		}
		}

		}

		static void printarray(int[] array){

		//for(int k=0;k<array.length;k++)

		System.out.println(" the sorrted array is="+Arrays.toString(array));

		
		}

		public static void main(String[] args){
		int[] array= new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};

		reversenegative(array);
		printarray(array);


		}


}
