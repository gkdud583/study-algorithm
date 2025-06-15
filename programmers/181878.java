class Solution {
    public int solution(String myString, String pat) {
        int result = myString.toLowerCase().indexOf(pat.toLowerCase());
        return result >= 0 ? 1 : 0;
    }
}
