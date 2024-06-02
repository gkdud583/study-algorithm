class Solution {
    public void rotate(int[] nums, int k) {
        int bef[] = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            bef[j] = nums[j];
        }

        for (int j = 0; j < nums.length; j++) {
            int from = j;
            int to = (from + k) % nums.length;
            nums[to] = bef[from];
        }
    }
}
