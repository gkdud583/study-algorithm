import java.util.*;

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char value = s.charAt(i);
      if (value == '(' || value == '{' || value == '[') {
        stack.add(value);
        continue;
      }
      if (stack.isEmpty()) {
        return false;
      }
      char last = stack.pop();
      if (value == ')' && last == '(') {
        continue;
      }
      if (value == ']' && last == '[') {
        continue;
      }
      if (value == '}' && last == '{') {
        continue;
      }
      return false;
    }
    return stack.isEmpty() ? true : false;
  }
}
