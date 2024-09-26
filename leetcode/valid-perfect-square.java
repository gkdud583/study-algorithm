class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 1;
        int right = num;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            long value = (long)mid * mid;
            if (value == num) return true;
        
            if (value < num) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
