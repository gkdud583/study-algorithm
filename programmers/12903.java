class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if (s.length() % 2 == 0) { 
            return String.valueOf(s.charAt(mid - 1)) + s.charAt(mid);
        }
        return String.valueOf(s.charAt(mid));
    }
}
