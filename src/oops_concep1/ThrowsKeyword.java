package oops_concep1;

public class ThrowsKeyword {

	public static void main(String[] args) { //throws ArithmeticException {//main method is in turn will be responsible for catching the expression
		// jvm will be ultimately responsible for catching the exception
		// TODO Auto-generated method stub
		ThrowsKeyword obj= new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
public void sum()  {// sum method is responsible for catching the exception
	try {
	div();}
catch (ArithmeticException e) {
	
}
	}


public void div() throws ArithmeticException {
	int i=9/0;//exception line
}


}
