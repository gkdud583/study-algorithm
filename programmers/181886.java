class Solution {
    public String[] solution(String[] names) {
        if (names.length <= 5) {
            return new String[]{names[0]};
        } 
        int size = 0;
        if (names.length % 5 == 0) {
            size = names.length / 5;
        } else {
            size = names.length / 5 + 1;
        }
        String[] answer = new String[size];
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            if (j >= names.length) {
                answer[i] = names[j - 4];
                break;
            }
            answer[i] = names[j];
            j += 5;
        }
    
        return answer;
    }
}
