class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return (Math.log10(n) / Math.log10(3)) % 1 == 0; // 로그를 이용한 방법
    }
}
