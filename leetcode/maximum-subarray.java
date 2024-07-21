class Solution {
    private void calcul(int i, int[] nums, int dp[][]) {
        if (i >= nums.length) {
            return;
        }
        dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        dp[i][0] = Math.max(dp[i - 1][0] + nums[i], nums[i]);
        calcul(i + 1, nums, dp);
    }
    public int maxSubArray(int[] nums) {
        boolean check = true;
        int max = Integer. MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] >= 0) {
                check = false;
            }
        }
        if (check) {
            return max;
        }

        int dp[][] = new int[nums.length][2];
        dp[0][0] = nums[0];
        calcul(1, nums, dp);
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }
}
