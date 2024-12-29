class Solution {
    public boolean rotateString(String s, String goal) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String shiftStr = s.substring(1) + s.charAt(0);
            list.add(shiftStr);
            s = shiftStr;
        }
        return list.contains(goal);
    }
}
