class Solution {
    public int[] numberGame(int[] nums) {
        int[] answer = new int[nums.length];

        Arrays.sort(nums);
        for (int i = 0; i + 1 < nums.length; i+=2) {
            answer[i] = nums[i + 1];
            answer[i + 1] = nums[i];
        }
        return answer;
    }
}
