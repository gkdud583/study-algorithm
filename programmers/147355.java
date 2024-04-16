class Solution {
  public int solution(String t, String p) {
    int answer = 0;
    for (int start = 0; start < t.length(); start++) {
      int end = start + p.length();
      if (end > t.length()) {
        break;
      }
      String substring = t.substring(start, end);
      boolean success = true;
      for (int i = 0; i < substring.length(); i++) {
        if (substring.charAt(i) - '0' > p.charAt(i) - '0') {
          success = false;
          break;
        }
        if (substring.charAt(i) - '0' < p.charAt(i) - '0') {
          success = false;
          answer++;
          break;
        }
      }
      if (success) {
        answer++;
      }
    }
    return answer;
  }
}
