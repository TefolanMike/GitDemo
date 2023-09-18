package oops_concep1;

public class ExceptionHandelling {
// int a=10;
//static ExceptionHandelling obj;	
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i=9/0;
		//int i=9/0;
		//System.out.println(i);// uncaught exception
		
	//	Thread.sleep(20000);//caught exception
		
		
		//ExceptionHandelling obj =new ExceptionHandelling();
		//obj=null;
		
		//1. try-catch block:
	// int i=9/0;
	 try {
		 int i=9/0;// this  code will give or throw a exception
		 }
		catch(Throwable e) {//all other exception class are child of airthmeticException class  
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	 System.out.println("ABC");
	 System.out.println("ABC");	
	 System.out.println("ABC");	
	}

}
//nOTE : There are two classes error class and exception class both classes are child of throwable class and object is the super super class of
//all the classes
//error=syntax,fatal,memory full. exception-unpredictable behavior of the code
//where suddenly exception comes like out of bound exception