import java.util.Arrays;

public class Longest_Common_Subsequence {
      public int dfs(int l1 , int l2 , String s1 , String s2 , int dp[][]){

        if(l1<0 || l2<0) return 0;
        // if(l1>=s1.length() || l2>=s2.length()) return 0;
        // // if


        if(dp[l1][l2]!=-1) return dp[l1][l2];

        if(s1.charAt(l1)==s2.charAt(l2)){
            return dp[l1][l2] = 1 + dfs(l1-1 , l2-1 , s1 ,s2,dp);
        }
        else{
            int lr = dfs(l1-1 , l2 , s1 , s2 , dp);
            int rr = dfs(l1 , l2-1 , s1 , s2 , dp);
            return dp[l1][l2] = Math.max(lr , rr);
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n][m];

        for(int i = 0 ; i<n ; i++){
                Arrays.fill(dp[i] , -1);
        }

         return dfs(n-1 , m-1 , text1 , text2 , dp);
       
    }   
}


