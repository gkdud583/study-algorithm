class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String op[] = binomial.split(" ");
        int a = Integer.valueOf(op[0]);
        int b = Integer.valueOf(op[2]);
        if (op[1].equals("+")) {
            return a + b;
        }
        if (op[1].equals("-")) {
            return a - b;
        }
        return a * b;
    }
}
