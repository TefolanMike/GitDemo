package Practice;

public class Singelton {//in oops this is a special class that can have only and only one object or instance of the class at a time
	//in case of multiple instatitions
	//it will point to single object
	// how to design a singleton class:
	// 1. make constructor as private
	//2. write a public static method that has return type object of this singleton class(Lazy Initialization)

	private static Singelton singleton_instance =null;
	
	public String str;
	
	private Singelton() {
		str="Hey, I am using singleton class pattern";
		
	}
	public static Singelton getInstance() {
		if(singleton_instance== null) {
			singleton_instance= new Singelton();
	}
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
