class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.contains(String.valueOf(x))) {
                answer.add(i);
            }
        }
        return answer;
    }
}
