package InterfaceConcept;

public interface USMedical extends WHO {//EXTENDS will be used because here there are two interfaces

	int min_free=10;

public void phyioServices() ;

public void OncologyServices() ;
public void orthopedicServices() ;

public void RadiologyServices() ;

// cannot create the object of interfaces
// only method declaration--method prototype-- no method body--Abstract Methods
//can not create static prototype methods in interface 
// but interface variable are static and final by default

// static method with method body in an interface

public static void Services_911() {  // this new feature from jdk 1.8 we can have static methods in a interface but with method body and this is non-abstract method.
	 
	System.out.println("USA 911--Services");// but why this facility and these services cannot be overridden
}

default void internship() {// this method cannot be static and cannot be overriden also
	
	System.out.println("US  ----- internship...");
}


}
