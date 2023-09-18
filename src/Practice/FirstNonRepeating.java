package Practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating{


public static void main(String[] args){

int [] array= new int[] {9, 4, 9, 5,6, 7, 4,6};
int n= array.length;

NonRepeating(array,n);

}

static int   NonRepeating( int[] array, int n){

	Map<Integer,Integer> hs= new HashMap<Integer,Integer>();

	int c = 0;

for( int i=0;i<n; i++){
 
if(hs.containsKey(array[i])){
// hs.put(array[i],hs.get(array[i]+1));
	hs.put(array[i],(hs.get(array[i])+1));

}

else{

hs.put(array[i],1);
}

}

//int [] arr2= new int[1];
//int index=0;
for(int i=0;i<n;i++){

if(hs.get(array[i])==1){
   c= array[i];
//return array[i];
 //System.out.println(array[i]);

}

}



return c;


}

}
