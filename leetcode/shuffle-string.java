class Solution {
    public String restoreString(String s, int[] indices) {
        char result[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int loc = indices[i];
            result[loc] = c;
        }
        return new String(result);
    }
}
