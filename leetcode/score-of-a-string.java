class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int value = Math.abs((int)s.charAt(i));
            if (i + 1 < s.length()) {
                value = Math.abs(s.charAt(i + 1) - s.charAt(i));
            }
            sum += value;
        }
        return sum;
    }
}
