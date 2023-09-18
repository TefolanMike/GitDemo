package java_Basics;

public class ConstructorConcept {

	
		// TODO Auto-generated method stub
    public ConstructorConcept() {
    	
    	System.out.println("Default Constructor");
    	}
    public ConstructorConcept(int i) {
		
    	System.out.println("single param Constructor");	
    	System.out.println("Value of i "+i);
    }
    public ConstructorConcept(int i ,int j) {
    	System.out.println("Double  param Constructor");	
    	System.out.println("the value of i " +i);	
    	System.out.println("the value of j" +j);	
    	
}
    
    public static void main(String[] args) {
    
    	ConstructorConcept obj= new ConstructorConcept();
    	ConstructorConcept obj1=new ConstructorConcept(10);
    	ConstructorConcept obj2=new ConstructorConcept(10,20);
    }
}
