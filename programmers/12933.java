import java.util.*;
class Solution {
    public long solution(long n) {
        char [] charArr = String.valueOf(n).toCharArray();
        Arrays.sort(charArr); 
        return Long.valueOf(new StringBuilder(new String(charArr)).reverse().toString()); 
    }
}
