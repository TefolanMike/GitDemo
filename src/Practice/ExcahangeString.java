package Practice;

import java.util.Arrays;

public class ExcahangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] array1= {"Maneesh","July","Phanesh","Jignesh"};
 
 String[] array2={"Dinesh","Mahesh","Gogi","Pagla"};
 String[] temp= new String[4];
 
 
 for(int i=0;i<array1.length;i++) {
	
	 temp[i]=array1[i];
	 array1[i]=array2[i];
	 array2[i]=temp[i];
	 
	 
 }
//for(int i=0;i<array1.length;i++) {
//	 
//	 System.out.println(temp[i]);
//	 
//	 
// }
 
System.out.println("array1="+ Arrays.toString(array1));
 System.out.println("array2="+ Arrays.toString(array2));
  
 
	  
//	  System.out.print(array1[k]+" ");  
//	System.out.println( Arrays.toString(array2));
//	 
     }

}
