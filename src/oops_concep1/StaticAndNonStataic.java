package oops_concep1;

public class StaticAndNonStataic {
String name="Tom";
static int age=25;//static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	sum();
	StaticAndNonStataic.sum();
	StaticAndNonStataic obj= new StaticAndNonStataic();
	
	System.out.println(obj.name);
	
	sum();///
	obj.sendMail();
	
	}

	public void sendMail(){
	
		System.out.println("Send mail method");
}
		
public static void sum(){
	
	System.out.println("Sum method");
}
			
		
	}


