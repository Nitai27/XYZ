package Secret;

/**
 * Queen_permutation
 */
public class Queen_permutation {

    public static void main(String[] args) {
        int n =4;
        boolean board[] = new boolean[n];
        int tq=2;
        print(board,tq,"",0);
        
    }

    private static void print(boolean[] board, int tq, String ans, int qpsf) {
       if (tq==qpsf) {
        System.out.println(ans);
        return;
        
       }
       for (int i = 0; i < board.length; i++) {
        if (board[i]==false) {
            board[i]=true;
            print(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1);
            board[i]=false;
            
        }
       }
    }
}