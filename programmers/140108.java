class Solution {
    public int solution(String s) {
        int answer = 0;
        int start = 0;
        int end = 1;
        int startCnt = 1, otherCnt = 0; //첫번째 문자와 이외의 문자를 카운트하기 위한 변수

        char firstLetter = s.charAt(start); //첫번째 문자
        boolean continuing = true;
        for (;  end < s.length(); end++) {
            char curLetter = s.charAt(end); 
            if (curLetter == firstLetter) {
                startCnt++;
            }
            else {
                otherCnt++;
            }
            
            if (startCnt == otherCnt) { //카운트가 같아지면 분해성공
                answer++;
                continuing = false;
                if (end + 1 < s.length()) {
                    start = end + 1;
                    firstLetter = s.charAt(start);
                    otherCnt = 0;
                    startCnt = 1;
                    end++;   
                    continuing = true;
                }
                continue;
            }
        }

        if (continuing) {
            answer++;
        }
        return answer;
    }
}
