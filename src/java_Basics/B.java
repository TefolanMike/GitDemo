package java_Basics;

public class B extends A {

public B () {
	
	super();// due to this it will go to the parent class constructor and if it is not then default const will be called
	//it should be the first statement in particular constructor
	//we cannot have two super key inside a constructor//for two value in super key two parameter constructor will be called
	System.out.println("Child class const");
}
public B (int i) {
	
	super(i);
	System.out.println("Child class const");
}
public B (int i,int j) {
	
	super(i,j);
	System.out.println("Child class const");
}

public static void main(String args[]) {
	
	B obj=new B();//controller from here will go to public b() form there to parent class A and execute the methods of A
	B obj1=new B(10);
	B obj2=new B(10,20);
}
}
