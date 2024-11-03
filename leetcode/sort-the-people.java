class People {
    int height;
    String name;

    People(int height, String name) {
        this.height = height;
        this.name = name;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<People> peoples = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            peoples.add(new People(heights[i], names[i]));
        }
        Collections.sort(peoples, (o1, o2) -> Integer.compare(o2.height, o1.height));
        String[] answer = new String[names.length];
        for (int i = 0; i < peoples.size(); i++) {
            answer[i] = peoples.get(i).name;
        }
        return answer;
    }
}
