class Solution {
    public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length())
      return false;

    Map<Character, Character> map = new HashMap<>();
    Set<Character> used = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      char cur = s.charAt(i);
      char correspondingChar = t.charAt(i);
      if (!map.containsKey(cur)) {
        if (used.contains(correspondingChar))
            return false;
        map.put(cur, correspondingChar);
        used.add(correspondingChar);
      }
      else {
        if (map.get(cur) != correspondingChar)
            return false;
      }
    }
    return true;
  }
}
