import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int cnt = 0;
        int overCnt = 0;
        int num = -10001;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num) {
                num = nums[i];
                nums[j++] = num;
                cnt++;
                overCnt = 1;
                continue;
            }

            if (overCnt >= 2) {
                continue;
            }
            cnt++;
            overCnt++;
            num = nums[i];
            nums[j++] = num;
        }
        return cnt;
    }
}
