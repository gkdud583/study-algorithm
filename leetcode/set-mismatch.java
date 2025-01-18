class Solution {
    public int[] findErrorNums(int[] nums) {
        int expected = 1;
        int answer[] = new int[2];
        boolean found[] = new boolean[10001];

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == expected) {
                found[num] = true;
                expected++;
                continue;
            }
            if (found[num]) {
                answer[0] = num;
                continue;
            } 
            found[num] = true;
            answer[1] = expected;
            expected = num + 1;
        }
        if (answer[1] == 0) {
            answer[1] = expected;
        }
        return answer;
    }
}
