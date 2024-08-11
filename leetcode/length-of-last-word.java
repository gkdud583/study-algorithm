class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                //end of word
                String word = s.substring(last, i);
                last = i+1;
                if (word.length() > 0) {
                    answer = word.length();
                }
                System.out.println(word);

                continue;
            }
        }
        if (s.charAt(s.length()-1) != ' ') {
            answer = s.substring(last, s.length()).length();
        }
        return answer;
    }
}
