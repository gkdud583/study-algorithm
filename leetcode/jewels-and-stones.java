class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (counts.containsKey(c)) {
                counts.replace(c, counts.get(c) + 1);
            }
            else {
                counts.put(c, 1);
            }
        }

        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (counts.containsKey(c)) {
                count += counts.get(c);
            }
        }
        return count;
    }
}
