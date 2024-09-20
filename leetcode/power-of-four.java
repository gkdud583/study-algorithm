class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return (Math.log10(n) / Math.log10(4)) % 1 == 0; // 로그를 이용한 방법
    }
}
