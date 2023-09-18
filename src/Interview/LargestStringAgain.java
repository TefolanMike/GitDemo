package Interview;

public class LargestStringAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
 
        int len = longestUniqueSubsttr(str);
 
        System.out.println("The length of the longest "
                           + "non-repeating character "
                           + "substring is " + len);
	}
	public static Boolean areDistinct(String str, int i,
            int j)
{

// Note : Default values in visited are false
         boolean[] visited = new boolean[256];

             for (int k = i; k <= j; k++) {
             if (visited[str.charAt(k)] == true)
                      return false;

              visited[str.charAt(k)] = true;
                 }
                 return true;
                   }

// Returns length of the longest substring
// with all distinct characters.
                 public static int longestUniqueSubsttr(String str)
                 {
                  int n = str.length();

                                 // Result
                      int res = 0;

                        for (int i = 0; i < n; i++)
                            for (int j = i; j < n; j++)
                               if (areDistinct(str, i, j))
                                 res = Math.max(res, j - i + 1);

                                                return res;
                                        }
	
	
	
                                     }
