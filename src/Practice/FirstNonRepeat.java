package Practice;

import java.util.ArrayList;

public class FirstNonRepeat {
	public static void main (String[] args){

		int[] array= new int[] {9, 4, 9, 6, 7, 4,6,7,8,9,8,10};
		int n= array.length;
		FirstNonRepeating(array,n);

		}
		public static void FirstNonRepeating(int [] array, int n){

		//int index=0;
		//int count=0;
		//int[] arr1= new int [index]; 
		ArrayList<Integer> list= new ArrayList<Integer>();

		for(int i=0;i<n;i++){
		     for(int j=i+1;j<n;j++){
		       if(array[i]==array[j]){
		     System.out.println("this is repeating element is ="+ array[i]);
		    
		      // count++;
		     list.add(array[i]);
		     
		     // arr1[index]=array[i];
		     // index++;
		        }
		      }
		   }
		for (int element : list) {
			
			System.out.println(element+" ");
		}

//		for(int k=0;k<count;k++){
//		   for(int j=0;j<n;j++){
//		 if(arr1[k]!=array[j])  {
//		 System.out.println("the first non-repeating element is="+array[j]);
//		}
//
//		}
//		}

		}

		
		}



