class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i = 0;
        for (i = 0; i < n_str.length(); i++) {
            char c = n_str.charAt(i);
            if (c != '0') {
                answer += c;
                break;
            }
        }
        return answer + n_str.substring(i + 1);
    }
}
