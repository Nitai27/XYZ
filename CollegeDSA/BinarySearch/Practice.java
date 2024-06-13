package BinarySearch;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        sudokuSolver(grid, 0, 0);
    }

    private static void sudokuSolver(int[][] grid, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            sudokuSolver(grid, row, col + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(grid, row, col, i)) {
                    grid[row][col] = i;
                    sudokuSolver(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    private static boolean isSafe(int[][] grid, int row, int col, int i) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[row][j] == i) {
                return false;
            }
        }
        for (int j = 0; j < grid.length; j++) {
            if (grid[j][col] == i) {
                return false;
            }
        }
        int r = row % 3;
        int c = col % 3;
        for (int j = r; j < r + 3; j++) {
            for (int j2 = c; j2 < c + 3; j2++) {
                if (grid[j][j2] == i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
