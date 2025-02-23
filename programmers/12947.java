class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int remain = x;
        while (remain > 0) {
            sum += remain % 10;
            remain = remain /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}
