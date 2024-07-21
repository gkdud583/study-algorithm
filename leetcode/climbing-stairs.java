class Solution {
    private int answer = 0;
    private int mem[] = new int[46];
    private void calcul(int targetPos, int curPos) {
        if (mem[targetPos - curPos] != -1) {
            answer += mem[targetPos - curPos];
            return;
        }
        if (curPos + 1 <= targetPos) {
            calcul(targetPos, curPos + 1);
        }
        if (curPos + 2 <= targetPos) {
            calcul(targetPos, curPos + 2);
        }
    }
    public int climbStairs(int n) {
        Arrays.fill(mem, -1);
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        if (n <= 2) {
            return mem[n];
        }
        for (int i = 3; i <= n; i++) {
            answer = 0;
            calcul(i, 0);
            mem[i] = answer;
        }
        return answer;
    }
}
