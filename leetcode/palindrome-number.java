class Solution {
    public boolean isPalindrome(int x) {
        String inorder = String.valueOf(x);
        StringBuffer sb = new StringBuffer(inorder);
        String reverse = sb.reverse().toString();

        return inorder.equals(reverse);
    }
}
