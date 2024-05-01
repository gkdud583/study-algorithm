import java.util.*;
class Solution {
  public int solution(int k, int m, int[] score) {
    int answer = 0;

    Integer[] temp = Arrays.stream(score).boxed().toArray(Integer[]::new);
    Arrays.sort(temp, Collections.reverseOrder());
    for (int i = 0; i < temp.length; i++) {
      if (i + m - 1 < temp.length) {
        answer += temp[i + m - 1] * m;
        i = i + m - 1;
      }
    }
        /*
        몇 개 테스트케이스가 실패하는데 이유를 모르겠음
        for (int s = k; s >= 1; s--) {
            if (count[s] < 1) {
                continue;
            }
            answer += count[s] / m * s * m;
            count[s] %= m;
            boolean success = false;
            int min = s;
            while (min >= 1 && count[min] >= 1) {
                if (count[min - 1] >= m - count[min]) {
                    count[min - 1] -= m - count[min];
                    min = min - 1;
                    s = min;
                    success = true;
                    break;
                }
                count[min - 1] += m - count[min];
                min--;
            }
            if (success) {
                answer += min * m;
                s++;
            }
        }
        */
    return answer;
  }
}
