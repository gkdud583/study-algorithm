class Solution {
    public int solution(int a, int b) {
        String v1 = String.valueOf(a) + b;
        int v2 = 2 * a * b;
        return Integer.parseInt(v1) >= v2 ? Integer.parseInt(v1) : v2;
    }
}
