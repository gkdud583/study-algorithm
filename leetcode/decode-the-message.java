import java.util.*;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> table = new HashMap<>();

        char substitutedChar = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c == ' ' || table.get(c) != null) {
                continue;
            }
            table.put(c, substitutedChar++);
        }
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                result += c;
                continue;
            }
            result += table.get(c);
        }
        return result;
    }
}
