package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindElemSum {

	public static void main (String[] args){

		int[] array= new int[]{10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int k=11;
		int n= array.length;
		
		// new array
		int[] array2= new int[] {1, 0, 0, 1, 0, 1, 1};
		int m= array2.length;
		
		
       Set<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			
			hs.add(array[i]);
			
		}
		System.out.println(hs.toString());
		
		int[] arr2= new int[hs.size()];
		int size= arr2.length;
		int f=0;
		
		 Iterator<Integer> it= hs.iterator();
		 while(it.hasNext()) {
			 
			 arr2[f]= it.next();
			 f++;
		 }
		 System.out.println(Arrays.toString(arr2));
		
//		for(int e: hs) {
//				arr2[f++]=e;
//			}

		System.out.println("The number of unique pairs="+FindUniqueElemWithSum(arr2,k,size));

		System.out.println("The number of  pairs="+FindElemWithSum(array,k,n));
		
		System.out.println("The number of  pairs woth equal 0s and 1a="+FindElemWithEqualNo0and1(array2,m));

		}

		
	static int FindUniqueElemWithSum(int[] arr2, int k,int size){

		int count=0;
		
		
	 
		
	
	 for(int i =0; i<size;i++){

		for(int j=i+1;j<size;j++){

		if((arr2[i]+arr2[j]==k)){
		System.out.println("the given pair is="+"( "+arr2[i]+","+arr2[j]+")");

		count++;

		}
		}
        }
		return count;
		}
	
	
	static int FindElemWithSum(int[] array, int k,int n){
		
		int  counter=0;
		for(int i =0; i<n;i++){

				for(int j=i+1;j<n;j++){

				if((array[i]+array[j]==k)){
				System.out.println("the given pair is="+"( "+array[i]+","+array[j]+")");

				counter++;

				}
				}
		        }
		return counter;
	}
	
	static int  FindElemWithEqualNo0and1(int[] array2, int m) {
		int  counter=0;
		for(int i =0; i<m;i++){

				for(int j=i+1;j<m;j++){
		       
					if((array2[i]==1 && array2[j]==0) ||(array2[i]==0 && array2[j]==1)) {
						
						System.out.println("the given pair is="+"( "+array2[i]+","+array2[j]+")");
						counter++;
					}
						
					}
					
	
				}
	    return counter;
}
	
	
}
