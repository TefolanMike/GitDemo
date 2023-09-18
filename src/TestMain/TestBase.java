package TestMain;

public class TestBase {

	//JVM ----main (String args[])--- public static void
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("main method-1");
	
	main("ganesh");
	main(10,20);
	main(10);
	
	}
	
	public static void main(String  args) {
		// TODO Auto-generated method stub
		  System.out.println("main method-2");
	}
	
	
	
	public static void main(int a) {
		// TODO Auto-generated method stub
		  System.out.println("main method-3");
	}

	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		  System.out.println("main method-4");
	}

}
