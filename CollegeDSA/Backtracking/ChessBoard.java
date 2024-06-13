package Backtracking;

public class ChessBoard {
    public static void main(String[] args) {
        int n = 3;
        //String ans = "";
        print(n,0,0,"");
        System.out.println(c);
    }
    static int c =0;

    private static void print(int n, int row, int col,String ans) {
        ans+="{"+row+"-"+col+"}";
        if (row>n || col>n) {
            return;
        }
        if (row==n-1 && col==n-1) {
            System.out.print(ans+" ");
            c++;
            return;
        }
        int [] r = {2,1};
        int [] c = {1,2};
        // knighthello worl
        for (int k = 0; k < c.length; k++) {
            print(n,row+r[k],col+c[k],ans+"k");
        }
        // rook
        if (row==0 || col==0 || row+1==n || col+1==n) {
            for (int i = col+1; i < n; i++) {
                print(n, row, i,ans+"R");
            }
            for (int i = row+1; i <n; i++) {
                print(n, i, col,ans+"R");
                
            }
            


            
        }
        // bishop
        if (row==col || row+col==n-1) {
            int r1 = row;
            int c1 = col;
            for(int i=1;i<n;i++){
               
                    print(n, r1+i, c1+i,ans+"B");
                
            }
        }

    }
}
