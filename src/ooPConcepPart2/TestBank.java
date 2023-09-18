package ooPConcepPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println(USBank.min_bal);
		
		
	HsbcBank b= new HsbcBank();	
	b.credit();	
	b.debit();
	b.carloan();
	b.transferMoney();
	b.educationloan();
	//Child class object can be reffredd by parent interface reference varaible
	
	USBank c= new HsbcBank();
	c.credit();
	c.debit();
	c.transferMoney();//car loan and Education loan cannot be accessed
	
	
	
	
	
	}

}
