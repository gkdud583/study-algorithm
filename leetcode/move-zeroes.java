class Solution {
    public void moveZeroes(int[] nums) {
        int answer[] = new int[nums.length];
        int zeroCnt = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
                continue;
            }
            answer[index++] = nums[i];
        }

        for (int i = 0; i < zeroCnt; i++) {
            answer[index++] = 0;
        }

        for (int i = 0; i < answer.length; i++) {
            nums[i] = answer[i];
        }
    }
}
