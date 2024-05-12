class Solution {
  public String solution(int[] food) {
    String answer = "";
    int cnt = 0;
    for (int i = 0; i < food.length; i++) {
      if (food[i] % 2 != 0) {
        cnt += food[i] - 1;
        continue;
      }
      cnt += food[i]; //전체 음식의 갯수
    }
    int[] arr = new int[cnt + 1];
    int start = 0;
    int end = cnt;
    for (int i = 1; i < food.length; i++) {
      for (int j = 0; j < food[i] / 2; j++) {
        arr[start++] = i;
      }
      for (int j = 0; j < food[i] / 2; j++) {
        arr[end--] = i;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }
    return answer;
  }
}
