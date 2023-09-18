package InterfaceConcept;

public class ApolloHosp extends GlobalPatientData implements USMedical,UKMedical , IndiaMedical {//implementing interface we have to add all the defined services

	@Override
	public void EmergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- Emergency");	
	}

	@Override
	public void nueroServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- Nuero");
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- ortho");
	}

	@Override
	public void ENTServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- ENT");	
	}

	@Override
	public void ambulanceServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- ambulance");
	}

	@Override
	public void phyioServices() {
		// TODO Auto-generated method stub
		
		System.out.println("AP ----- physio");
	}

	@Override
	public void OncologyServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- Onco");	
	}

	@Override
	public void orthopedicServices() {
		// TODO Auto-generated method stub
		System.out.println("AP ----- ortho");
	}
	
	@Override
	public void RadiologyServices() {// we have to override only one time and inside this method we can write specific methods for India ,UK and US.
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coronaServices() {
		// TODO Auto-generated method stub
		
	}

	// non overriden methods:
	
	public void OPDServices() {
		
		System.out.println("AP ----- OPD");
	}
public void PathologyServices() {
		
		System.out.println("AP -----PathologyServices");
	}
public void medicaIndurance () {
	
	System.out.println("AP -----medicaIndurance");
}




}
