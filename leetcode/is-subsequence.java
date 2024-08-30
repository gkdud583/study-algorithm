class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = t.indexOf(c, index + 1);
            System.out.println(idx);
            if (index >= idx) {
                return false;
            }
            index = idx;
        }
        return true;
    }
}
