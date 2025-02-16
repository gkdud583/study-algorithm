class Solution {
    public long solution(long n) {
        long num = (long)Math.sqrt(n);
        if (num * num != n) {
            return -1;
        }
        return (long)Math.pow(num + 1, 2);
    }
}
