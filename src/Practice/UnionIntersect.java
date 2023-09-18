package Practice;

import java.util.Arrays;

public class UnionIntersect {

	
		public static void main (String[] args){

			int[] arr1= new int[] {1, 2, 4, 5, 6 };
			int[] arr2= new int[]{2, 3, 5, 7};
			int n= arr1.length;
			int m=arr2.length;
			intersection(arr1,arr2,n,m);

			}

			static void intersection(int [] arr1,int[] arr2,int n, int m){
			
           int index=0;
           int[] arr3= new int[m];
			for(int i=0;i<n;i++){
			 for(int j=0;j<m;j++){

			if(arr1[i]==arr2[j]){
			System.out.println(" the common array element="+arr1[i]);
			arr3[index]=arr1[i];
                 index++;


			}


			}



			}
            for(int k=0;k<index;k++) {
            	System.out.println(Arrays.toString(arr3));
            }
			
			
			}

}
