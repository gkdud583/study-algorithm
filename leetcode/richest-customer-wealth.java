class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int money = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                money += accounts[i][j];
            }
            answer = Math.max(answer, money);
        }
        return answer;

    }
}
