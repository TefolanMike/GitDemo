package ooPConcepPart2;

public class TestCar {
	public static void main(String[] args) {// main method can be overridden
		
		//static polymoriphisim-----compile time polymorphisim
		BMW b =new BMW() ;
		b.start();
		b.stop();
		b.THESAFTEY();
		b.Refule();
		b.Engine();
		
		System.out.println("fffffffbommmmm");
		Car c=new Car();
		c.start();
		c.stop();
		c.Refule();////cannot call BMW saftey functions
		c.Engine();
		
		System.out.println("fffffffbommmmm");
		
	
	// Top Casting 	
	Car c1=	new BMW();//child class object can be refrerred by parent  class 
	//refernce variable is called dynamic plymorphisimor 
	//or run time ploymorpisim
	Vehicle v1= new BMW();
	v1.Engine();
	//v1.start()- a parent class cannot access the child methods so it is multi level inheritance-allowed in java but multiple inheritance is not .

	c1.start();
	c1.stop();
	c1.Refule();//only parent calss method and overriden method can be called --BMW PROHIBIT acees saftey method
	
	//dOWNCasting
	BMW b1=(BMW) new Car();//ClassCastException
	
	
	}
}