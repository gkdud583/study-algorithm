class Solution {
    private boolean detectCapital(String word) {
        if (word.charAt(0) < 65 && word.charAt(0) > 90) {
            return false;
        }
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 97 || word.charAt(i) > 122) {
                return false;
            }
        }
        return true;
    }
    private boolean detectUpercate(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 65 || word.charAt(i) > 90) {
                return false;
            }
        }
        return true;
    }
    private boolean detectLowercase(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 97 || word.charAt(i) > 122) {
                return false;
            }
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        if (!detectCapital(word) && !detectUpercate(word) && !detectLowercase(word)) {
            return false;
        }
        return true;
    }
}
