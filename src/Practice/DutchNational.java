package Practice;

import java.util.Arrays;

public class DutchNational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int temp;

		for(int i=0; i<array.length;i++){

		for(int j=i+1; j<array.length;j++){

		if(array[i]>=array[j]){
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;

		}
		}
		}	
		
		System.out.println(Arrays.toString(array));
		
System.out.println("the sorrted array is=");
		
		for (int k = 0; k < array.length; k++) {     
            System.out.print(array[k] + " ");  
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
	}

}
