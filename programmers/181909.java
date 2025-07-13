import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> prefixs = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            prefixs.add(my_string.substring(i));
        }
        Collections.sort(prefixs);
        return prefixs.toArray(new String[0]);
    }
}
