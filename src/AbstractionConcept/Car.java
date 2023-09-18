package AbstractionConcept;

public interface Car {
// we use interface when we hide all features(100% abstraction) and abstract in case of partial abstraction
// abstraction meaning is to hide features
// abstraction class is more efficient than interface class

//only final and static variables are defined:
	
	int wheels =4;// by default this will be treated as final and static
	
	
// we define only abstract method--- means no method body and only and only method declaration--no need to write abstraction method
// we achieve 100% abstraction
// we cannot object of Interface  and both interface and abstract class are abstract in nature
	
	public abstract  void start ();// abstract keyword is not necessary to write here
	public void stop();
	public void refuel();
	
}
