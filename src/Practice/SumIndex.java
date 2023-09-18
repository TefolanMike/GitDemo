package Practice;

public class SumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {1, 4, 20, 3, 10, 5};

		System.out.println("the sum between the indexes 2 and 6 is="+SumArray(array,2,6));

		}

	public static int SumArray( int[] array, int x, int y){

		int temp;
		int sum=0;
		int size= array.length;

		for(int i=x-1; i<=y-1;i++){
		
		sum=sum+array[i];
		}
		return sum;

		}
	}


