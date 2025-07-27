class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (alp.equals(String.valueOf(c))) {
                char to = (char)(c - 32);
                answer += to;
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
