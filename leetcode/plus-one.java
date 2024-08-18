class Solution {
    public int[] plusOne(int[] digits) {
        StringBuffer str = new StringBuffer(Arrays.toString(digits));

        String willRemove[] = {"[", "]", ",", " "};
        for (int i = 0; i < willRemove.length; i++) {
            while (str.indexOf(willRemove[i]) != -1) {
                int index = str.indexOf(willRemove[i]);
                str.deleteCharAt(index);
            }
        }
        int last = str.length() - 1;
        boolean endFlag = false;
        while (last >= 0 && !endFlag) {
            endFlag = true;
             if (str.charAt(last) - '0' >= 9) {
                endFlag = false;
            }
            int added = str.charAt(last) - '0' + 1;
            System.out.println(added);
            if (added >= 10) 
                str.setCharAt(last, '0');
            else
                str.setCharAt(last, Integer.toString(added).charAt(0));
            System.out.println(str);
            last--;
        }
        if (last < 0 && !endFlag) {
            str.insert(0, "1");
        }
        String result = str.toString();
        int answer[] = new int[str.length()];
        for (int i = 0; i < result.length(); i++)
            answer[i] = Integer.parseInt(String.valueOf(result.charAt(i)));
        return answer;
    }
}
