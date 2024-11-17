class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int counts[] = new int[101];
        int answer[] = new int[2];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counts[nums[i]] >= 1) {
                answer[index++] = nums[i];
                continue;
            }
            counts[nums[i]]++;
        }
        return answer;
    }
}
