class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int num = 1; num <= 9; num++) {
            answer += num;
        }
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }
}
