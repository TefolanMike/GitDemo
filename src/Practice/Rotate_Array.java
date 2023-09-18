package Practice;

import java.util.Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= new int[] {1,12,13,6,7,8,9};
		int[] arr1= new int[] {1,12,13,6,7,80,90};
		int[] arr2= new int[] {1,120,13,60,7,80,90};
		int n= array.length;
		int m= arr1.length;
		int d=3;
		int e=1;
		rotatethree(array,n,d);
		rotateRightOne(arr1,m);
		rotateRightthree(arr2,m,d);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
}
	static int[] rotatethree(int [] array, int n, int d){
		
		
		int[] temp= new int[] {1,12,13};
		int index=0;

		for(int i=d;i<n;i++){

		array[i-d]= array[i] ;

		}

		
		for(int i=n-d;i<n;i++){
			
			array[i]=temp[index];
			index++;
		}

 return array;

		}
	
	
	static void rotateRightOne(int [] arr1, int m) {
		
		int last_element=arr1[m-1];
		for(int q=m-1;q>0;q--) {
		 arr1[q]=arr1[q-1];
		 
		
		}
		arr1[0]= last_element;
		
		
	}
	
	
static void rotateRightthree(int [] arr2, int m,int d ){
		
		int[] temp1= new int[] {7,80,90};
		int counter=0;
		for(int q=d;q<m;q++) {
		 arr2[q]=arr2[q-d];
		 }
		for(int l=0;l<3;l++) {
			arr2[l]=temp1[counter];
			counter++;
		}
		
		
	}
	
	
		}
	


