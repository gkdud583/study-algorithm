class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.replace(num, 2);
                continue;
            }
            count.put(num, 1);
        }

        for (int num : nums) {
            int cnt = count.get(num);
            if (cnt == 1) {
                return num;
            }
        }
        return 0;
    }
}
