// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int dp[][] = new int[A.length + 1][2];
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        dp[0][0] = A[0];
        dp[0][1] = sum;
        int index = 1;
        int minDiff = Math.abs(dp[0][1] - dp[0][0]);
        for (; index < A.length - 1; index++) {
            dp[index][0] = dp[index - 1][0] + A[index];
            dp[index][1] = dp[index - 1][1] - A[index];
            if (minDiff > Math.abs(dp[index][1] - dp[index][0])) {
                minDiff = Math.abs(dp[index][1] - dp[index][0]);
            }
        }
        return minDiff;
    }
}
