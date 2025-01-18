class Solution {
    public int[] countBits(int n) {
        int answer[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int num = i;
            String bin = Integer.toBinaryString(num);
            int cnt = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
