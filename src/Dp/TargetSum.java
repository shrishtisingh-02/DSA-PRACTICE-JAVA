package Dp;

public class TargetSum {
    static int findTargetSumWays(int[] n, int[] arr, int target) {
        return helper(0,target,arr);
    }

    private static int helper(int i, int target, int[] arr) {

        if (i == arr.length) {
            if (target == 0) return 1;
            else return 0;
        }
        int add=helper(i+1,target-arr[i],arr);
        int sub=helper(i+1,target+arr[i],arr);
        return add+sub;
    }
}
