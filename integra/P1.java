import java.util.Arrays;

public class P1 {

    static int solve(String s1,String s2,int i,int j,int[][] dp)
    {
        if(i < 0)
            return j + 1;

        if(j < 0)
            return i + 1;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] =
                    solve(s1,s2,i-1,j-1,dp);

        return dp[i][j] =
                1 + Math.min(
                        solve(s1,s2,i-1,j,dp),
                        Math.min(
                                solve(s1,s2,i,j-1,dp),
                                solve(s1,s2,i-1,j-1,dp)
                        )
                );
    }

    public static void main(String[] args)
    {
        String s1 = "camp";
        String s2 = "camps";

        int[][] dp = new int[s1.length()][s2.length()];

        for(int[] row : dp)
            Arrays.fill(row,-1);

        boolean res =
            solve(s1,s2,s1.length()-1,s2.length()-1,dp) == 1;

        System.out.println(res ? "Yes" : "No");
    }
}