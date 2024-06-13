package Backtracking;

import Secret.permutation;

public class n_Queen {
    public static void main(String[] args) {
        int[][] board = new int[4][4];
        int q=4;
        print(board,q,0,0);
    }

    private static void print(int[][] board, int tq , int row , int q) {
       if (tq==q) {
        display();
        return;
       }
       if (row==board.length) {
        return;
       }
       for (int col = 0; col < board[0].length; col++) {
        if (ispossible(board,row,col)) {
            board[row][col]=1;
            print(board, tq, row+1, q+1);
            board[row][col] =0;
        }

        
       }
    }

    private static void display() {
        for (int i = 0; i < array.length; i++) {
            
        }
    }

    private static boolean ispossible(int[][] board, int row, int col) {
        if (board[row][col] != 'q') {
            return true;
        }
        return false;
    }
}
