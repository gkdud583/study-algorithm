import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> sequence = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            sequence.put(players[i], i);
            answer[i] = players[i];
        }
        
        for (int i = 0; i < callings.length; i++) {
            String cur = callings[i];
            int from = sequence.get(cur);
            String bef = answer[from - 1];
            int to = sequence.get(bef);
            sequence.replace(cur, to);
            sequence.replace(bef, from);
            answer[to] = cur;
            answer[from] = bef;
        }
        return answer;
    }
}
