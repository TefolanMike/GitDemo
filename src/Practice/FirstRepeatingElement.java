package Practice;

public class FirstRepeatingElement {
	
	public static void main (String[] args){

		int[] array= new int[]{10, 5, 3, 4, 3, 5, 6};
		int n = array.length;

		FirstRepeatElem(array,n);
		}

		static void  FirstRepeatElem(int [] array, int n){
		int count=0;
		 
		for(int i=0; i<n;i++){
		   for(int j=i+1; j<n;j++){
		       if(array[i]==array[j]) {
		          count++;
		          if (count==1){
		     		 System.out.println("The first common element is="+array[i]);
		       }

		  

		}

		}

		}


		}
		}


