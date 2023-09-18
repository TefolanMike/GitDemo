package java_Basics;

public class LocalVsGlobal {

	
	
	String name="Tom";
	int age=31;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVsGlobal obj= new LocalVsGlobal();
		int i =12;
		int j=12;
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(j);//local
		}

	public void sum() {
	
	int i=10;///local
	int j=30;
	int age=25;//global  variable
	System.out.println(age);
	
	
	}
}
