package dp;

public class O_I_knapsack {
    public static void main(String[] args) {
        int []wt={2,3,4,1};
        int[]val={4,3,6,7};
        int cap=8;
        int [][]dp=new int[4][cap+1];
//        for(int i=0;i<dp.length;i++){
//            for(int j=0;j<dp[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }
  //      System.out.println( knapsack(dp,wt,val,0,cap));
        for(int i=0;i<4;i++){
            for(int j=0;j<cap+1;j++) {
                int skip = (i > 0) ? dp[i - 1][j] : 0;
                if (wt[i] > j) dp[i][j] = skip;
                else {
                    int pick = val[i];
                    pick += (i > 0) ? dp[i - 1][j - wt[i]] : 0;
                    dp[i][j] = Math.max(skip, pick);
                }
            }
        }
        System.out.println(dp[4-1][cap]);
    }

    private static int knapsack(int[][] dp, int[] wt, int[] val, int i, int cap) {
             if(i==wt.length) return 0;
            int skip=knapsack(dp,wt,val,i+1,cap);
            if(wt[i]>cap) return skip;
            int pick=val[i]+knapsack(dp,wt,val,i+1,cap-wt[i]);
            return Math.max(skip,pick);
    }
}
