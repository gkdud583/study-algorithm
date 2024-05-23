class Solution {
  public boolean isAnagram(String s, String t) {
    int[] cnt = new int[123];
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
      cnt[(int)s.charAt(i)]++;
      total++;
    }
    for (int i = 0; i < t.length(); i++) {
      if (cnt[(int)t.charAt(i)] < 1) {
        return false;
      }
      cnt[(int)t.charAt(i)]--;
      total--;
    }
    return total == 0 ? true : false;
  }
}
