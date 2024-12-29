class Solution {
    public String reverseWords(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank()) {
                StringBuilder sb = new StringBuilder(words[i]);
                result += sb.reverse();
                if (i < words.length - 1) {
                    result += " ";
                }
            }
        }
        return result;
    }
}
