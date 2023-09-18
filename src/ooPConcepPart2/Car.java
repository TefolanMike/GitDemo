package ooPConcepPart2;

public class Car extends Vehicle  {

	//method hiding concept 
	public  void start() {// static method can be overload but not good practice to override
		System.out.println("Car Starts");	
		
	}
	
	public static void start(int a) {
		System.out.println("Car----- Starts");	
		
	}
	public static void start(String price ) {
		System.out.println("Car----- Starts");	
		
	}
	
	
	public void stop() {
		System.out.println("Car Stops");	
		
	}
	
	public void Refule () {
		System.out.println("Car refule");	
		
	}
}
