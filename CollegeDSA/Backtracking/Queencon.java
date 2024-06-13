package Backtracking;

public class Queencon {
    public static void main(String[] args) {
        int q=2;
        boolean [] board = new boolean[4];
        print(board,q,"",1,0);
    }

    private static void print(boolean[] board, int tq, String ans, int qp,int idx) {
        if (tq<qp) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i]==false) {
                board[i]=true;
                print(board, tq, ans+"B"+i+"Q"+qp, qp+1,i+1); 
                

            }
            board[i]=false;  
       
        }
        
    }
}
