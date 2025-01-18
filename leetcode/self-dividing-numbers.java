class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            String str = String.valueOf(num);
            boolean success = true;
            for (int j = 0; j < str.length(); j++) {
                int divisor = str.charAt(j) - '0';
                if (divisor == 0) {
                    success = false;
                    break;
                }
                if (divisor != 0 && num % divisor != 0) {
                    success = false;
                    break;
                }
            }
            if (success) {
                answer.add(num);
            }
        }
        return answer;
    }
}
