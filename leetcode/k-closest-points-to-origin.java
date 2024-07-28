class Solution {
    class Pos {
        int x;
        int y;
        double c;
        Pos(int x, int y, double c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        List<Pos> distances = new LinkedList<>();
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt((Math.pow(points[i][0], 2.0) + Math.pow(points[i][1], 2.0)));
            distances.add(new Pos(points[i][0], points[i][1], distance));
            System.out.println(distance);
        }

        distances.sort((o1, o2) -> Double.compare(o1.c, o2.c));
        int answer[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            Pos pos = distances.get(i);
            answer[i][0] = pos.x;
            answer[i][1] = pos.y;
        }

        return answer;
    }
}
