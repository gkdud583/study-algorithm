class Solution {
    public int solution(int[][] sizes) {
        int h = 0, w = 0;
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            w = Math.max(w, max);
            h = Math.max(h, min);

            /*
            60 50 // 60 0
            70 30 // 70
            60 30
            80 40
            */
        }
        return h * w;
    }
}
