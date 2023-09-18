package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW n= new BMW();
		n.start();
		n.start();
		n.stop();
		n.refuel();
		n.theftSaftey();
		Car c= new BMW();// child class object accessed  referred by parent interface reference variable= d.polymorphisim or top casting
		
		c.start();
		c.stop();
		c.refuel();// can't access theft safety method of BMW class
		
	}

}
