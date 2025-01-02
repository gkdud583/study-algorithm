class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int lindex = 0; lindex < nums.length - 1; lindex++) {
            left[lindex + 1] = nums[lindex] + left[lindex];
        }
        for (int rindex = nums.length - 1; rindex > 0; rindex--) {
            right[rindex - 1] = nums[rindex] + right[rindex];
        }

        
        int[] answer = new int[left.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.abs(left[i] - right[i]);
        }
        return answer;
    }
}
