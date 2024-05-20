class Solution {
  public int maxProfit(int[] prices) {
    int[][] table = new int[prices.length][2];
    table[0][0] = 0;
    table[0][1] = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - table[i - 1][1] > table[i - 1][0]) {
        table[i][0] = prices[i] - table[i - 1][1];
      }
      else {
        table[i][0] = table[i - 1][0];
      }
      if (prices[i] < table[i - 1][1]) {
        table[i][1] = prices[i];
        continue;
      }
      table[i][1] = table[i - 1][1];
    }
    return table[prices.length - 1][0];
  }
}
