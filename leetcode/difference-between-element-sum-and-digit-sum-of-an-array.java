class Solution {
    public int differenceOfSum(int[] nums) {
        int sumOfNums = 0;
        int sumOfDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i];
            int num = nums[i];
            while (num > 0) {
                sumOfDigit += num % 10;
                num = num / 10;
            }
        }
        return (int)Math.abs(Math.max(sumOfNums, sumOfDigit) - Math.min(sumOfNums, sumOfDigit));
    }
}
