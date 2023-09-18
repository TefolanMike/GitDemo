package AbstractionConcept;

public abstract class Bank {//there should be one abstract method
	int amt=100;
	final int rate =10;
	static int loanRate= 5;
	
	// partial abstraction 
	//means hiding the implementation logic

public abstract void  loan () ;                          //1. abstract method -no method body and only method declaration
//4. here loan method is unique feature need to be defined //2.one abstract method is compulsory and multiple abstract and non-abstract method can be there
//in each class                                                         //3.can't create object of abstract class

public void credit() {// non abstract method// this feature is common to all class
	
	System.out.println("Bank--- Credit");
}

public void debit() {// no abstract method
	
	System.out.println("Bank--- debit");
}












}
