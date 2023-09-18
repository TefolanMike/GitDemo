package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// USMedical us =new USMedical ();//can not create object of Interface
	ApolloHosp ap= new ApolloHosp();
	ap.ambulanceServices();
	ap.EmergencyServices();
	ap.ENTServices();
	ap.nueroServices();
	ap.nueroServices();
	ap.OncologyServices();
	
	System.out.println(ap.min_free);//here it is giving warning because a static variable should be accessed by static way 
	System.out.println(USMedical.min_free);//can be accessed by interface and class name
	System.out.println(USMedical.min_free);
	
	USMedical.Services_911();
	ap.internship();//parent properties can be easily accessed 
	
	
	ap.getPatientHistory();// can access patient methods 
	//top Casting -child class object referred by parent interface reference variable
	
	USMedical us =new ApolloHosp();
	us.OncologyServices();
	us.orthopedicServices();
	us.phyioServices();
	//us.ent();//cannot access ent services because multiple inheritance is not allowed and only those method from USmedical can be accessed
	
	us.internship();
	
	
	UKMedical uk =new ApolloHosp();
	uk.ambulanceServices();
	uk.ENTServices();
	
	// downcasting
	// new USMedical();//strictly not allowed
	
	
	
	}

}
