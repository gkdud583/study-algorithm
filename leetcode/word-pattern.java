class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> dic = new HashMap<>();
        Set<String> used = new HashSet<>();

        String[] words = s.split(" "); // 공백 문자(스페이스, 탭 등)로 분리
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (dic.get(pattern.charAt(i)) == null) {
                if (used.contains(words[i])) {
                    return false;
                }
                used.add(words[i]);
                dic.put(pattern.charAt(i), words[i]);
                continue;
            }
            if (!dic.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }
        return true;
    }
}
