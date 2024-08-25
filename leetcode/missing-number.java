class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean arr[] = new boolean[n + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }

        for (int start = 0; start <= n; start++) {
            if (!arr[start]) {
                return start;
            }
        }
        return 0;
    }
}
