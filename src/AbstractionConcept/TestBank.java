package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hdfc hb= new Hdfc();
		hb.credit();//parent method
	    hb.debit();//
	    hb.loan();//Overridden
	    hb.funds();//non-overridden method
	
	    Bank b=   new Hdfc();//dynamic polymorphisim
	    b.credit();
	    b.debit();
	    b.loan();// we can't access funds method here because reference variable is of bank class
	}

}
