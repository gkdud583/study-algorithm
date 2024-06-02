import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int num = -1000000001;
        int cnt = 0;
        int maxCnt = 0;
        int answer = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num) {
                num = nums[i];
                cnt = 1;
            } 
            else {
                cnt++;
            }
            if (maxCnt < cnt) {
                answer = num;
                maxCnt = cnt;
            }
        }
        return answer;
    }
}
