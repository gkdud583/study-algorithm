class Solution {
    public String truncateSentence(String s, int k) {
        String word[] = s.split(" ");
        String result = "";
        for (int i = 0; i < k; i++) {
            result += word[i];
            if (i + 1 < k) {
                result += " ";
            }
        }
        return result;
    }
}
