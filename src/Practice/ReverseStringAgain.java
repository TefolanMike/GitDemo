package Practice;

public class ReverseStringAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello Infosys";
		
       String[] sr1=  s.split(" ");
       
      String str1= sr1[1];
      String str2= sr1[0];
      String Final= str1+" "+str2;
      System.out.println("final"+Final);
      
      char[] c= Final.toCharArray()  ;
      
      System.out.println(c[0]);
      
      for(int i=0;i< c.length;i++) {
    	  char j=c[i];
    	  
    	  if(Character.isUpperCase(j)) {
    		  
    		  
    		c[i]=  Character.toLowerCase(j);
    	  }
    	  else if (Character.isLowerCase(j)) {
    		  
    		c[i]=  Character.toUpperCase(j);
    	  }
    	  }
   
   System.out.print(c);
       
       
	
	
	
	
	
	}

}
