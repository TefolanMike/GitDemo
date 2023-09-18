package java_Basics;

public class ConstructorWithThisKeyword {

	String name;//class variables
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name=name;//when we want to initialize the global or class variable with the current value of constructor we use this keyword
		this.age=age;
		System.out.println(name);	
		System.out.println(age);
	}
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Tom",30);{
			
			
		}
		
	}
}
