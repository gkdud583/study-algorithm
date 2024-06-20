class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        String result = "";
        int n = 0; //넘길 수 
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum = a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sum += n;
            n = 0;
            if (sum == 2) {
                sum = 0;
                n = 1;
            }
            else if (sum == 3) {
                sum = 1;
                n = 1;
            }
            result = sum + result;
        }
        if (n == 1) {
            result = n + result;
        }
        return result;
    }
}
