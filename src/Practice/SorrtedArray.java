package Practice;

public class SorrtedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] array= new int[] {130,8,10,5,55,60,3};
		int[] array= new int[] {100,200,300,100,200,500,100,400};
		int temp;

		for(int i=0; i<array.length;i++){

		for(int j=i+1; j<array.length;j++){

		if(array[i]>array[j]){
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;

		}
		}
		}
		System.out.println("the sorrted array is=");
		
		for (int k = 0; k < array.length; k++) {     
            System.out.print(array[k] + " ");   
            

		System.out.println(" The number of times 100 occurs"+noofooccurences(array, 100));
		System.out.println(" The number of times 200 occurs"+noofooccurences(array, 200));
		System.out.println(" The number of times 300 occurs"+noofooccurences(array, 300));
		System.out.println(" The number of times 400 occurs"+noofooccurences(array, 400));
		System.out.println(" The number of times 100 occurs"+noofooccurences(array, 500));
		
		}	
	}	
	
	
	static int noofooccurences(int[] array, int x){
		int res=0;
		for(int i=0; i<array.length;i++){
			if(x==array[i]) {
				res++;
				
			}
			
		}
		return res;
		
	}
		
}

