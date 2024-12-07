class Solution {
    public String convertDateToBinary(String date) {
        String answer = "";
        String[] dateStr = date.split("-");
        for (int i = 0; i < dateStr.length; i++) {
            int num = Integer.parseInt(dateStr[i]);
            answer += Integer.toBinaryString(num) + "-";
        }
        return answer.substring(0, answer.length() - 1);
    }
}
