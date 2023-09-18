package ooPConcepPart2;

public class HsbcBank implements USBank, BrazilBank {// we are achieving  multiple inheritance
	// is a relationship--
	
	//if a class is implementing any interface,then it is mandatory to define/override all the
	//methods of interface 
	
	//first three overriding methods from USBank
	public void credit() {
		
		
		System.out.println("hsbc credit");
	}
	public void debit() {
		System.out.println("hsbc debit");	
		
	}
	public void transferMoney(){
	System.out.println("transfer Money");// we have to write all these methods to avoid error
	}

	//overriding methods from HsbcBank
	public void educationloan() {
		System.out.println("transfer education loan");	
	}
//  overriding methods from BrazilBank
	public void carloan(){
		System.out.println("transfer carloan");
	}
	//Brazil Bank Method
	 public void mutualFund() {
		 System.out.println("transfer mutual fund");	 
		 
	 }
	
}




