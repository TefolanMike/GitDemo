package Practice;

public class MissingNumber {
	
	public static void main (String[] args) {
	int [] array= new int[] {1, 2, 4, 6, 3, 7, 8};
	int n =array.length;
	int last_element=array[n-1];
	int sumArray=(last_element*(last_element+1))/2;
	System.out.println("the missing number is="+missingNumber(array,n,sumArray));
		
	}

	static int missingNumber(int[] array,int n,int sumArray) {
		
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum=sum+array[i];
			
		}
		int missingNO=sumArray-sum;
		return missingNO;
		
	}
}
