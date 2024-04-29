import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];        
        int[] index = new int[123]; //z=122
        Arrays.fill(index, -1); //처음엔 -1로 채워둠
        for (int i = 0; i < s.length(); i++) {
            int num = (int)(s.charAt(i));
            int lastIndex = index[num]; //해당 숫자의 마지막 위치
            if (lastIndex == -1) { //-1이라면 처음 나온 숫자
                //처음 나온 숫자
                answer[i] = -1;
                index[num] = i;
                continue;
            }
            answer[i] = i - lastIndex;
            index[num] = i;
        }
        return answer;
    }
}
