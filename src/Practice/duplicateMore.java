package Practice;

public class duplicateMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{ 1, 2, 3, 2, 3,4,5,5,6 };

		int temp=0;
		
		//int[] newArray= new int[4];	
		
		for(int i=0;i<array.length;i++){
			
			for(int j=i+1;j<array.length;j++) {
				
			if(array[i]==array[j]) {
				System.out.println("The duplicate elements are ="+array[j]);
				
				
			}
			
			}
	}

	}
}