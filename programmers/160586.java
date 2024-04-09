class Solution {
  private static int max = 987654321;
  public int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];

    for (int i = 0; i < targets.length; i++) {
      String target = targets[i];
      for (int j = 0; j < target.length(); j++) {
        int min = max;
        for (int k = 0; k < keymap.length; k++) {
          int index = keymap[k].indexOf(String.valueOf(target.charAt(j)));
          if (index == -1) {
            continue;
          }
          min = Math.min(min, index + 1);
        }
        if (min == max) {
          answer[i] = -1;
          break;
        }
        answer[i] += min;
      }
    }
    return answer;
  }
}
