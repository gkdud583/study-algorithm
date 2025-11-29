// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        Collections.sort(list);

        boolean plus = true;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (plus) {
                sum += n;
            }
            else {
                if (sum - n != 0) {
                    return sum;
                }
                sum -= n;
            }
            plus = !plus;
        }
        return sum;
    }
}
