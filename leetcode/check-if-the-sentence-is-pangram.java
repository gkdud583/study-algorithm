class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean found[] = new boolean[123];
        int cnt = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (found[c]) {
                continue;
            }
            found[c] = true;
            cnt++;
        }
        return cnt == 26 ? true : false;
    }
}
