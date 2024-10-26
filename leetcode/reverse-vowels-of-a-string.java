class Solution {
    public String reverseVowels(String s) {
        Set<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        String result = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (vowels.contains(c.toLowerCase())) {
                list.add(c);
            }
        }
        int j = list.size() - 1;
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));

            if (!vowels.contains(c.toLowerCase())) {
                result += c;
                continue;
            }
            if (j >= 0) 
                result += list.get(j--);
        }
        return result;
    }
}
