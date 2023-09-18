package Practice;

public class MiddleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {30,8,10,5,55,60,3};
		int size= a.length;
		System.out.println(size);

		if(size%2==0){
			
		int n=((size/2)-1);
		int middle= a[n];
		System.out.println("The middle number is="+ middle+"And"+a[n+1]);
		}
		
	else{

	int middleNo= a[(size/2)];
	System.out.println("The middle number is="+middleNo);

	}
		
		
		
		
		
		
		
		
	}

}
