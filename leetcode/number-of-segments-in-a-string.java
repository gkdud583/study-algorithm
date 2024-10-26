class Solution {
    public int countSegments(String s) {
        String[] words = s.split(" ");

        int cnt = 0;
        for (String word : words) {
            if (word.length() >= 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
