class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String lowercase = word.toLowerCase();
            boolean success = true;
            int loc = 0;
            for (int j = 0; j < lowercase.length(); j++) {
                char c = lowercase.charAt(j);
                int found = 0;
                if (row1.indexOf(c) != -1) {
                    found = 1;
                }
                else if (row2.indexOf(c) != -1) {
                    found = 2;
                }
                else if (row3.indexOf(c) != -1) {
                    found = 3;
                }
                if (loc != 0 && found != loc) {
                    success = false;
                    break;
                }
                loc = found;
            }
            if (success) {
                answer.add(word);
            }
        }
        return answer.toArray(new String[0]);
    }
}
