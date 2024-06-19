import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int cnt[] = new int[123];
        for (int i = 0; i < magazine.length(); i++) {
            cnt[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (cnt[ransomNote.charAt(i) - 'a'] <= 0) {
                return false;
            }
            cnt[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
