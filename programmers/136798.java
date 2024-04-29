/*
약수의 개수를 구하고 = k
if k <= max -> sum += k;
else -> sum += max;
*/
class Solution {
  private int getCountOfFactors(int number) {
    int cnt = 0;
    if (number == 1) {
      return 1;
    }
    for (int i = 1; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        cnt++;
        if (i != number / i) {
          cnt++;
        }
      }
    }
    return cnt;
  }

  public int solution(int number, int limit, int power) {
    int answer = 0;
    for (int i = 1; i <= number; i++) {
      int w = getCountOfFactors(i);
      if (w <= limit) {
        answer += w;
        continue;
      }
      answer += power;
    }
    return answer;
  }
}
