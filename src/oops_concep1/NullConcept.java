package oops_concep1;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.  Case sensitive :
		// Object obj= null;

		
		//2. default ref value will be null
		
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		//3. 
//		Integer i=null;// Integer here is a class
//		int j=i;// a null value is assigned to a primitive data type so a null value will be thrown 
		
		//4. instanceof
//		Integer l=null;
//		Integer m=10;
//		System.out.println(l instanceof Integer);
//		System.out.println(i instanceof Integer);
		
	//4. static vs non-static 
		
		NullConcept obj=null;
		//obj.send();//getting warning because object is pointing to null   
	 obj.sum();
	 
	 //5. == and !=
	 System.out.println(null==null);
	 System.out.println(null !=null);
	 
	 //6.
	 String str =null;
	 Integer i1= null;
	 Double d1=null;
	 
	 String s1= (String) null;
	 System.out.println(s1+ "123");
	// System.out.println(s1.length());//any string manipulation cannot be be done after typecasting into string value 
	 System.out.println(s1.charAt(0));
	 
	 Integer i2=(Integer) null;
	 double d2=(Double) null;
	 
	 
	 
	 
	 
	}
		
	public static void sum() {//static method can be accessed by the null  references -important 
		System.out.println("sum");	
	}
	public  void send () {
		System.out.println("send ");	
	}
	
	
	
	
	
	
	
	
	}

