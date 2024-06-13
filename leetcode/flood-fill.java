class Solution {
    private void fill(int[][] image, int y, int x, int v, int color, boolean[][] visit) {
        if (y < 0 || x < 0 || y >= image.length || x >= image[0].length) {
            return;
        }
        if (visit[y][x]) {
            return;
        }
        if (image[y][x] == v) {
            image[y][x] = color;
            visit[y][x] = true;
            fill(image, y + 1, x, v, color, visit);
            fill(image, y, x + 1, v, color, visit);
            fill(image, y - 1, x, v, color, visit);
            fill(image, y, x - 1, v, color, visit);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visit = new boolean[image.length][image[0].length];
        fill(image, sr, sc, image[sr][sc], color, visit);
        return image;
    }
}
