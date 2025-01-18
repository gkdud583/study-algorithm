class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] medal = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        String answer[] = new String[score.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(i + 1, score[i]);
        }
        // Map.Entry로 List 변환 후 첫 번째 값을 기준으로 내림차순 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        // 내림차순 정렬 (첫 번째 값을 기준으로)
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        // 정렬된 결과 출력
        int i = 1;
        for (Map.Entry<Integer, Integer> entry : list) {
            String value = "";
            if (i > medal.length) {
                value = String.valueOf(i);
            } else {
                value = medal[i - 1];
            }
            i++;
            answer[entry.getKey()-1] = value;
        }
        return answer;
    }
}
