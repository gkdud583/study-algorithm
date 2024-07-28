class Solution {
    class Pos {
        int x;
        int y;
        Pos(int x, int y) {
            this.y = y;
            this.x = x;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // 동일한 객체일 경우
            if (obj == null || getClass() != obj.getClass()) return false; // null 또는 다른 클래스일 경우

            Pos that = (Pos) obj; // obj를 MyClass로 형변환

            return this.y == that.y && this.x == that.x;
        }
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][] {newInterval};
        }

        List<Pos> list = new LinkedList<>();
        int x = newInterval[0];
        int y = newInterval[1];
        for (int i = 0; i < intervals.length; i++) {
            list.add(new Pos(intervals[i][0], intervals[i][1]));
        }

        list.add(new Pos(newInterval[0], newInterval[1]));
        list.sort((o1, o2) -> (int) (o1.x - o2.x));
        int index = list.indexOf(new Pos(newInterval[0], newInterval[1]));
        List<Pos> merged = new LinkedList<>();
        for (int i = 0; i < index; i++) {
            merged.add(list.get(i));
        }

        for (int i = index; i < list.size(); i++) {
            Pos cur = list.get(i);
            Pos bef = cur;
            if (merged.size() > 0) {
                bef = merged.get(merged.size() - 1);
            }

            if (cur.x <= bef.y && cur.y >= bef.y) {
                if (merged.size() > 0) {
                    merged.remove(merged.size() - 1);
                }
                merged.add(new Pos(bef.x, cur.y));
                continue;
            }
            if (cur.x >= bef.x && cur.y <= bef.y) {
                continue;
            }
            //독립적으로 존재
            merged.add(new Pos(cur.x, cur.y));
        }

        for (int i = 0; i < list.size(); i++) {
            Pos pos = list.get(i);
            System.out.println(pos.x + " " + pos.y);
        }
        int result[][] = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            Pos pos = merged.get(i);
            result[i][0] = pos.x;
            result[i][1] = pos.y;
        }
        return result;
    }
}
