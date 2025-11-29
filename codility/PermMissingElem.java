// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        boolean[] nums = new boolean[A.length + 2];
        for (int i = 0; i < A.length; i++) {
            nums[A[i]] = true;
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!nums[i]) {
                return i;
            }
        }
        return A.length + 1;
    }
}
