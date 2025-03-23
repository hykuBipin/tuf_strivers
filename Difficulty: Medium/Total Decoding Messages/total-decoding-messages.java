//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String digits = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countWays(digits);
            out.println(ans);

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int countWays(String digits) {
        int N=digits.length();
        
        if(digits==null || N==0 || digits.charAt(0)=='0')
        {
            return 0;
        }
        
        int[] dp = new int[N+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2; i<=N; i++)
        {
            int onedigit =Integer.parseInt(digits.substring(i-1,i));
          if (onedigit >= 1) {
            dp[i] += dp[i-1];
          }
          
            int doubledigit = Integer.parseInt(digits.substring(i-2,i));
          if (doubledigit >= 10 && doubledigit <= 26) {
            dp[i] += dp[i-2];
          }
        }
        
        return dp[N];
    }
}