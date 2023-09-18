package java_Basics;

public class DataType {
// I am so lost in my life
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a= "I am very stressed"	;
	System.out.println(a);

	int i[]= new int[4];
	
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	
System.out.println(i[2]);
System.out.println(i.length);

for(int j=0; j<i.length; j++) {
	
	System.out.println(i[j]);
}
	
double d[]= new double[2];
char c[]=new char[4];

boolean b[]= new boolean[6];

String s[]= new String [5];


Object ob[]=new Object [6];

ob[0]= "Tom";
ob[1]=23;
ob[2]=12.33;
ob[3]='L';
ob[4]="1/2/2022";
ob[5]="Mumbai";

System.out.println(ob.length);








	}

}
