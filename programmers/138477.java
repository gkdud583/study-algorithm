import java.util.*;

class Solution {
  public int[] solution(int k, int[] score) {
    int[] answer = new int[score.length];
    List<Integer> sortedList = new LinkedList<>();

    for (int i = 0; i< score.length; i++) {
      sortedList.add(new Integer(score[i]));
      Collections.sort(sortedList, Collections.reverseOrder());
      if (sortedList.size() < k) {
        answer[i] = sortedList.get(sortedList.size() - 1);
        continue;
      }
      answer[i] = sortedList.get(k - 1);
    }
    return answer;
  }
}
