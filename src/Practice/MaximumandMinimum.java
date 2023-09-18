package Practice;

public class MaximumandMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {4,30,8,10,5,55,60,3};
		int size= array.length;
		int maximum=array[0];
		int minimum=array[0];

		for(int i=1;i<size;i++){
		  
		 if(array[i]> maximum){
		    maximum=array[i]; }
		 }
		System.out.println("The max value of array="+maximum);

		for(int i=1;i<size;i++){
		  
		 if(array[i]< minimum){
		    minimum=array[i]; }
		 }
		System.out.println("The min value of array="+minimum);
	}

}
