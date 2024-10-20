class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int dp[][] = new int[flowerbed.length][2];

        for (int i = 0; i < flowerbed.length; i++) {
            int loc = flowerbed[i];
            int sum = 0;
            if (i - 1 >= 0) {
                sum += flowerbed[i - 1];
            }
            if (i + 1 < flowerbed.length) {
                sum += flowerbed[i + 1];
            }
            if (loc == 0) {
                if (sum >= 1) {
                    if (i - 1 >= 0)
                        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
                } else {
                    dp[i][0] = 1;
                    if (i - 1 >= 0)
                        dp[i][0] = dp[i - 1][1] + 1;
                }
            }
            else {
                if (i - 1 >= 0)
                    dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            }
            if (i - 1 >= 0)
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[flowerbed.length - 1][0], dp[flowerbed.length - 1][1]) >= n;
    }
}
