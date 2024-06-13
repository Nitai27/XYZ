package Backtracking;

public class SudokoSolver {
   public static void main(String[] args) {
    int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
                solve(grid,0,0);
   }

private static void solve(int[][] grid, int row, int col) {
    if (col==9) {
        col=0;
        row=row+1;
    }
    if (row==9 ) {
        dispaly(grid);
         return;
    }
   if (grid[row][col]!=0) {
    solve(grid, row, col+1);
   } 
   else{
    for (int i = 1; i <=9; i++) {
        if (check(grid,row,col,i)) {
            grid[row][col]=i;
            solve(grid, row, col+1);
            grid[row][col]=0;
        }
    }
   }
}// word search 

private static void dispaly(int[][] grid) {
   for (int i = 0; i < grid.length; i++) {
   for (int j = 0; j < grid.length; j++) {
    System.out.print(grid[i][j]+" ");
   } 
   
   System.out.println();
   }
}

private static boolean check(int[][] grid, int row, int col, int val) {
    int r = row;
    int c = col;
    // for row
    for (int j = 0; j < grid.length; j++) {
        if (grid[j][c]==val) {
            return false;
            
        }
    }
    for (int j = 0; j < grid[0].length; j++) {
        if (grid[r][j]==val) {
            return false;
            
        }
    }
    // for 3*3 matrix
    r=row-row%3;
    c=col-col%3;
    for (int i = r; i < r+3; i++) {
        for (int j = c; j < c+3 ;j++) {
            if (grid[i][j]==val) {
                return false;
            }
            
        }
    }
    return true;

}


}
