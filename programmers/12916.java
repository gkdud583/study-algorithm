class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'p' || cur == 'P')
                p++;
            else if (cur == 'y' || cur == 'Y')
                y++;
        }

        return p == y;
    }
}
