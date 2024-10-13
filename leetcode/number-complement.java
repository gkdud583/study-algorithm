class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] binaryArray = binary.toCharArray(); 
        for (int i = 0; i < binaryArray.length; i++) {
            char c = binaryArray[i];
            if (c == '1') {
                binaryArray[i] = '0';
            } else {
                binaryArray[i] = '1';
            }
        }
        String result = new String(binaryArray); 
        return Integer.parseInt(result, 2);
    }
}
