import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result[i] = -1;
                continue;
            }
            result[i] = nums[i];
            cnt++;
        }
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == -1) {
                continue;
            }
            nums[j++] = result[i];
        }
        return cnt;
    }
}
