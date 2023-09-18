package Practice;

public class Union1 {

	public static void main(String[] args){

		int[] array1= new int[]{1, 3, 4, 5, 7};
		int[] array2= new int[]{2, 3, 5, 6};
		int m= array1.length;
		int n= array2.length;
		union(array1,array2,m,n);
		}



		static int union(int[] array1, int[] array2, int m, int n){

		int i=0;
		int j=0;
		
		while(i<m && j<n){
		if(array1[i]< array2[j]){

		
		System.out.println(array1[i++]+" ");
		}
		else if(array1[i]>array2[j]){
		System.out.println(array1[j++]+" ");
		}
		else{
		System.out.println(array2[j++]+" ");

		i++;
		}
		}

		if(i<m){

		System.out.println(array1[i++]+" ");

		}

		if(j<n){

		System.out.println(array2[j++]+" ");

		}

		return 0;

		}


}
