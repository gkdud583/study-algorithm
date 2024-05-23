class Solution {
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    String result = s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(result);
    StringBuilder reversed = new StringBuilder(result).reverse();
    return reversed.toString().equals(result);
  }
}
