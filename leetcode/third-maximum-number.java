class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        Collections.sort(list, Comparator.reverseOrder());

        if (list.size() < 3) {
            return list.get(0);
        }
        return list.get(2);
    }
}
