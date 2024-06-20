import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int cnt = map.get(num);
                if (cnt >= 1) {
                    return true;
                }
                map.replace(num, cnt + 1);
                continue;
            }
            map.put(num, 1);
        }
        return false;
    }
}
