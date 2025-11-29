// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        if (A.length == 0) {
            return new int[0];
        }
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = 0; i < A.length; i++) {
            stack.push(A[i]);
        }

        for (int i = 0; i < K; i++) {
            int n = stack.removeFirst();
            stack.addLast(n);
        }
        int answer[] = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
