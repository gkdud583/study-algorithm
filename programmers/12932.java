class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int answer[] = new int[sb.length()];
        StringBuilder reversed = sb.reverse();
        for (int i = 0; i < reversed.length(); i++) {
            answer[i] = reversed.charAt(i) - '0';
        }
        
        return answer;
    }
}
