class Solution {
  public String solution(String s, String skip, int index) {
    String answer = "";
    for (int i = 0; i < s.length(); i++) {
      int count = 0;
      int c = (int)(s.charAt(i));
      while (count < index) {
        count++;
        c = c + 1;
        if (c >= 123) {
          c = (int)'a';
        }
        if (skip.contains(String.valueOf((char)c))) {
          count--;
        }
      }
      answer += (char)c;
    }
    return answer;
  }
}
