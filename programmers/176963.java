import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scores = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scores.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (scores.containsKey(photo[i][j])) {
                    score += scores.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
