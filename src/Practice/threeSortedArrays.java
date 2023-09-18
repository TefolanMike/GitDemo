package Practice;

public class threeSortedArrays {
	public static void main (String[] args){

		int[] arr1= new int[] {1, 5, 10, 20, 40, 80};
		int[] arr2= new int[] {6, 7, 20, 80, 100};
		int [] arr3= new int[]{3, 4, 15, 20, 30, 70, 80, 120};

		int n = arr1.length;
		int m= arr2.length;
		int o= arr3.length;

	sortedArrays(arr1,arr2,arr3,m,n,o);

		}

		static void sortedArrays(int[] arr1, int [] arr2, int[] arr3,int m, int n, int o){
		for(int i=0; i<n; i++){
		  for(int j=0;j<m;j++){
		       for(int k=0; k<o;k++){
		    
		  if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr3[k]==arr1[i]){

		 System.out.println(arr1[i]);
		}

		}

		}

		}

    
		}
}
