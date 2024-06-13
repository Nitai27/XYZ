package Secret;

public class MatrixMove {
   public static void main(String[] args) {
    int n =3;
    int m = 3;
    print(n,m,"",0,0);
   }

private static void print(int n, int m, String ans,int i,int j) {
    if (i==n-1 && j==m-1) {
        System.out.println(ans);
        return;
        
    }
    if (i>n || j>m) {
        return;
    }
    print(n, m, ans+"H", i+1, j);
    print(n, m, ans+"V", i, j+1);
   
} 
}
