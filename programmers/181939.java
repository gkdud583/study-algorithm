class Solution {
    public int solution(int a, int b) {
        String astr = String.valueOf(a) + b;
        String bstr = String.valueOf(b) + a;
        if (Integer.parseInt(astr) >= Integer.parseInt(bstr)) {
            return Integer.parseInt(astr);
        }
        return Integer.parseInt(bstr);
        
    }
}
