//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
   int removals(int[] arr, int n, int k) {
       // 1 Sort the array
        Arrays.sort(arr);

        int i=0, j=0, maxRange = 0;
       
        // Traverse linearly [0 to N] and check for the largest window that has
        // diff. value ( arr[j]-arr[i] ) less than k
        while(j<n){
            // if diff. less than k increase the window / right pointer ( j )
            if(arr[j]-arr[i] <= k) j++;
            // if diff is more than k increase left pointer ( i )
            else if(i < j) i++;
            // calculate and save the max value of ( maxRange or j-i )
            maxRange = Math.max(maxRange, j - i);

        }

        return n-maxRange;

    }
}