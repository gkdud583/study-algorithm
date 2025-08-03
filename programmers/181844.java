import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < delete_list.length; i++) {
            int index = answer.indexOf(delete_list[i]);
            if (index == -1) {
                continue;
            }
            answer.remove(index);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
