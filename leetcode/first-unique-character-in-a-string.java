class Solution {
    public int firstUniqChar(String s) {
        int used[] = new int[123];
        int loc[] = new int[123];
        for (int i = 0; i < s.length(); i++) {
            used[(int)s.charAt(i)]++;
            loc[(int)s.charAt(i)] = i;
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < used.length; i++) {
            if (used[i] == 1) {
                answer = Math.min(answer, loc[i]);
            }
        }
        if (answer == Integer.MAX_VALUE)
            return -1;
        return answer;
    }
}
