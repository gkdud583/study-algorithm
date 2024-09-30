class Solution {
    public String addStrings(String num1, String num2) {
        String srt = num1;
        String lng = num2;
        if (num1.length() < num2.length()) {
            lng = num2;
            srt = num1;
        }
        String sum = "";
        int si = srt.length() - 1;
        int li = lng.length() - 1;
        int next = 0; // 9 + 9 = 18, next = 1
        long v1 = 0, v2 = 0, s = 0;
        int remain = 0;
        while (si >= 0 || li >= 0) {
            if (si >= 0 && li >= 0) {
                v1 = srt.charAt(si--) - '0';
                v2 = lng.charAt(li--) - '0';
                s = v1 + v2 + next;
                next = (int)(s / 10); 
                remain = (int)(s % 10); // 9 + 9 = 18, remain = 8
                sum = remain + sum;
            }
            else if (si >= 0) {
                v1 = srt.charAt(si--) - '0';
                s = v1 + next;
                next = (int)(s / 10); 
                remain = (int)(s % 10); // 9 + 9 = 18, remain = 8
                sum = remain + sum;
            }
            else {
                v2 = lng.charAt(li--) - '0';
                s = v2 + next;
                next = (int)(s / 10); 
                remain = (int)(s % 10); // 9 + 9 = 18, remain = 8
                sum = remain + sum;
            }
        }
        if (next > 0) {
            sum = next + sum;
        }
        return sum;
    }
}
