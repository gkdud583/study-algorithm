import java.util.*;

class Solution {
  public int solution(int[] ingredient) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < ingredient.length; i++) {
      stack.push(ingredient[i]);
      while (stack.size() >= 4) {
        int num[] = new int[4];
        num[0] = stack.pop();
        num[1] = stack.pop();
        num[2] = stack.pop();
        num[3] = stack.pop();
        if (num[0] == 1 && num[1] == 3 && num[2] == 2 && num[3] == 1) {
          answer++;
          continue;
        }
        stack.add(num[3]);
        stack.add(num[2]);
        stack.add(num[1]);
        stack.add(num[0]);
        break;
      }
    }



    return answer;
  }
}
