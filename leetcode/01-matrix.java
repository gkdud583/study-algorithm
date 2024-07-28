import java.util.*;
class Solution {
    class Pos {
        int y;
        int x;
        int c;
        Pos(int y, int x, int c) {
            this.y = y;
            this.x = x;
            this.c = c;
        }
    }
    private int dy[] = {-1, 1, 0, 0};
    private int dx[] = {0, 0, -1, 1};
    public int[][] updateMatrix(int[][] mat) {
        int distance[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++)
            Arrays.fill(distance[i], Integer.MAX_VALUE);
    
        Queue<Pos> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    distance[i][j] = 0;
                    queue.add(new Pos(i, j, 0));
                    continue;
                }
            }
        }
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
            for (int i = 0; i < 4; i++) {
                int ny = pos.y + dy[i];
                int nx = pos.x + dx[i];
                if (ny < 0 || nx < 0 || ny >= mat.length || nx >= mat[0].length) {
                    continue;
                }
                
                if (distance[ny][nx] <= pos.c + 1) {
                    continue;
                }
                distance[ny][nx] = pos.c + 1;
                queue.add(new Pos(ny, nx, pos.c + 1));
            }
        }
        return distance;
    }
}
