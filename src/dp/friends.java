package dp;

import java.util.Arrays;

public class friends {
    public static int pair(int [] dp,int n){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=pair(dp,n-1)+(n-1)*(pair(dp,n-2));
    }
    public static void main(String[] args) {
        int n=4;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(dp,n));

    }
}
