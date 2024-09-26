class Solution {
    public int secondHighest(String s) {
        int num[] = new int[10];
        List<Integer> nums = new LinkedList<>();
        for (int j = 0; j < s.length(); j++) {
            char cur = s.charAt(j);
            if (cur >= '0' && cur <= '9') {
                if (num[cur - '0'] == 0) {
                    num[cur - '0']++;
                    nums.add(cur - '0');
                }
            }
        }
        Collections.sort(nums, Comparator.reverseOrder());
        if (nums.size() < 2) {
            return -1;
        }
        return nums.get(1);
    }
}
