class Solution {
    public String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length();) {
            char first = command.charAt(i);
            if (first == 'G') {
                result += 'G';
                i++;
                continue;
            }
            if (first == '(') {
                char second = command.charAt(i + 1);
                if (second == ')') {
                    result += "o";
                    i+=2;
                }
                else {
                    result += "al";
                    i+=4;
                }
            }

        }
        return result;
    }
}
