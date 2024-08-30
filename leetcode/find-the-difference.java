class Solution {
    public char findTheDifference(String s, String t) {
        int t1[] = new int[123];
        for (int i = 0; i < s.length(); i++) {
            t1[(int)s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (t1[(int)t.charAt(i)] <= 0) {
                return t.charAt(i);
            }
            t1[(int)t.charAt(i)]--;
        }
        return ' ';
    }
}
