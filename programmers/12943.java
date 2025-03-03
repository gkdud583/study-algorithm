class Solution {
    public int solution(int num) {
        long value = num;
        int count = 0;
        while (value != 1) {
            if (count >= 500) {
                return -1;
            }
            if (value % 2 == 0) {
                value /= 2;
            }
            else {
                value = value * 3 + 1;
            }
            count++;
            
        }
        return count;
    }
}
