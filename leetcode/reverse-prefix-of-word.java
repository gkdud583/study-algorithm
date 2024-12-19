class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        String result = "";


        int loc = sb.toString().indexOf(ch);
        StringBuilder sub = new StringBuilder(sb.substring(0, loc + 1));
        result = sub.reverse().toString();
        result += sb.substring(loc + 1);
        
        return result;
    }
}
