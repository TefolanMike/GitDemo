package oops_concep1;

public class MethodOverloading {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj= new MethodOverloading();
		
		obj.sum(10,5);
		obj.sum();
	}

	public static void main(char c) {///same main method can be overloaded 
		
	}
	
	public void sum() {
		
		System.out.println("SUM Method:");
		}
   public void sum(int i) {
		
		System.out.println("SUM Method:");
		}
   public void sum(int i, int j) {
	
	System.out.println("SUM Method:");//method overloading#
	System.out.println(i+j);
	}	
}

