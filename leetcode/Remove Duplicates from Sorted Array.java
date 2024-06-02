class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        int val = -101;
        int result[] = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            result[j++] = nums[i];
            val = nums[i];
            cnt++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return cnt;
    }
}
