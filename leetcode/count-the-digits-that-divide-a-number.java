class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int divide = num;
        while (divide > 0) {
            if (num % (divide % 10) == 0) {
                sum++;
            }
            divide /= 10;
        }
        return sum;
    }
}
