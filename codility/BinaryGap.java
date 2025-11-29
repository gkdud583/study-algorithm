// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // Implement your solution here
        String binary = Integer.toBinaryString(N);
        String[] splited = binary.split("1");
        int answer = 0;
        for (int i = 0; i < splited.length; i++) {
            if (i == splited.length - 1) {
                if (binary.charAt(binary.length() - 1) == '0') {
                    continue;
                }
            }
            answer = Math.max(answer, splited[i].length());
        }
        return answer;
    }
}
