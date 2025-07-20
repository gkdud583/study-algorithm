class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'A') {
                answer += 'B';
            } else {
                answer += 'A';
            }
        }
        if (answer.indexOf(pat) == -1) {
            return 0;
        }
        return 1;
    }
}
