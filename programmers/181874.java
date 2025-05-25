class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char cur = myString.charAt(i);
            if (cur == 97) {
                answer += 'A';
            }
            else if (cur >= 66 && cur <= 90) {
                answer += (char)(cur + 32);
            }
            
            else
                answer += cur;
        }
        return answer;
    }
}
