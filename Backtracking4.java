public class Backtracking4 {
    public void getAns(int[][] mat, int row, int col, String path) {
        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || mat[row][col] == 0) {
            return;
        }

        if (row == mat.length - 1 && col == mat[0].length - 1) {
            System.out.println(path);
            return;
        }


        mat[row][col] = 0;
        getAns(mat, row + 1, col, path + "D");
        getAns(mat, row - 1, col, path + "U");
        getAns(mat, row, col + 1, path + "R");
        getAns(mat, row, col - 1, path + "L");
        mat[row][col] = 1;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 0,1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        Strings s = new Strings();
        s.getAns(mat, 0, 0, "");
    }
}
