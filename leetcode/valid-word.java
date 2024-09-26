class Solution {
    private static char consonant[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    private static char vowel[] = {'a', 'e', 'i', 'o', 'u'};
    public boolean isValid(String word) {
        String str = word.toLowerCase();
    
        if (str.length() < 3) {
            return false;
        }
        int conditions[]  = {0,0,0};
        for (int i = 0; i < word.length(); i++) {
            boolean fail = true;
            char c = str.charAt(i);
            if (c >= '0' &&  c <= '9') {
                conditions[0]++;
                fail = false;
                continue;
            }
            for (int j = 0; j < consonant.length; j++) {
                if (c == consonant[j]) {
                    conditions[1]++;
                    fail = false;
                    break;
                }
            }
            for (int j = 0; j < vowel.length; j++) {
                if (c == vowel[j]) {
                    conditions[2]++;
                    fail = false;
                    break;
                }
            }
            
            if (fail) {
                return false;
            }
        }
        if (conditions[1] >= 1 && conditions[2] >= 1) {
            return true;
        }
        return false;
    }
}
