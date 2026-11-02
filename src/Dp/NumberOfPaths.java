//package Dp;
//
//public class NumberOfPaths {
//    static int[][] dp;
//
//    public int numberOfPaths(int m, int n) {
//        dp = new int[m + 1][n + 1];
//        return Paths(m, n);
//    }
//
//    public class Paths(int m, int n) {
//    if(m==1||n==1)return 1;
//    if(dp[m][n]!=0) return dp[m][n];
//        Paths(m-1, n)+Paths(m, n-1);
//    }
//}
