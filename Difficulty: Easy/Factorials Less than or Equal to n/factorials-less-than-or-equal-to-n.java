//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        helper(n,1,1,result);
        return result;
    }
    
    static void helper(long n, long currfact, long currnum, ArrayList<Long> result)
    {
        if (currfact > n) {
            return;
        }
        
        result.add(currfact);
        helper(n, currfact * (currnum+1),currnum+1, result);
    }
}