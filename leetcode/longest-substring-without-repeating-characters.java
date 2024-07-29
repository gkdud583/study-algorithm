class Solution {
    public int lengthOfLongestSubstring(String s) {
if (s.length() <= 1) {
      return s.length();
    }

    int start[] = new int[s.length()];
    String dp[][] = new String[s.length()][2];
    dp[0][0] = Character.toString(s.charAt(0));
    dp[0][1] = "";
    start[0] = 0;
    for (int i = 1; i < s.length(); i++) {
      dp[i][1] = dp[i-1][0];
      if (dp[i-1][0].length() < dp[i-1][1].length()) {
        dp[i][1] = dp[i-1][1];
      }
      char c = s.charAt(i);
      if (dp[i-1][0].contains(Character.toString(c))) {
        int index = dp[i-1][0].indexOf(Character.toString(c)) + start[i-1];
        dp[i][0] = s.substring(index+1, i + 1);
        start[i] = index+1;
        continue;
      }
      dp[i][0] = dp[i-1][0] + c;
      start[i] = start[i-1];
    }
    return dp[s.length() - 1][0].length() > dp[s.length() - 1][1].length() ? dp[s.length() - 1][0].length() : dp[s.length() - 1][1].length();
  }
}
