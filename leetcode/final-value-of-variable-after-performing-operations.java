class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.contains("++")) {
                answer++;
            }
            else {
                answer--;
            }
        }
        return answer;
    }
}
