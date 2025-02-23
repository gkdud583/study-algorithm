import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % divisor == 0) {
                answer.add(num);
            }
        }
        if (answer.size() == 0) {
            return new int[]{-1};
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
