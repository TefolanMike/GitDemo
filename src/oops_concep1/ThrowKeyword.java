package oops_concep1;

public class ThrowKeyword {

	public static void main(String[] args) {// when we have to deliberately throw the exception
		// TODO Auto-generated method stub

		System.out.println("ABC");
	try {	
	    throw new Exception("Naveen Exception");
	} catch (Exception e) {
	e.printStackTrace();	
		
	}
	System.out.println("PQR");
	
	String Exec_Flag="";
	if(Exec_Flag.equals("")) {
		try {
			throw new Exception("Exec flag is blank Exception");		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	System.out.println("PQR");
}
		
}