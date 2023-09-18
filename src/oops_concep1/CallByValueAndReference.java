package oops_concep1;

public class CallByValueAndReference {
 int p;
 int q;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CallByValueAndReference obj= new CallByValueAndReference();
		int x=10;
		int y=20;
		obj.testsum(x, y);//call by value or pass value
		obj.testsum(10, 020);
		
		obj.p=50;
		obj.q=60;
		
	obj.swap(obj);//we should pass reference only here 
	System.out.println(obj.p);
	System.out.println(obj.q);
	}

public int testsum(int a, int b) {
	int c= a+b;
	return c;      }

///call by refernce

public void swap(CallByValueAndReference t) {
	int temp;
	temp=t.p;//temp=50
	
	t.p=t.q;//t.p=60
	t.q=temp;//t.p=50
	
	
}
}
