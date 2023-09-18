package AbstractionConcept;

public class BMW implements Car {

	@Override
	public void start () {
		
		System.out.println("BMW ----START");
	}
	public void stop() {
		
		System.out.println("BMW ----STOP");
	}
	public void refuel() {
		
		System.out.println("BMW ----REFUEL");
	}

//non-overridden methods
	
	public void theftSaftey() {
		System.out.println("BMW ----theftSaftey");	
	}



}
