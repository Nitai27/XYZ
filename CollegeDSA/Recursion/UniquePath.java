package Recursion;

public class UniquePath {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        print(arr,"",0,0);
           
    }

    private static void print(int[][] arr, String ans, int i, int j) {
        if (i==2 && j==2) {
            System.out.println(ans);
            return;
        }
        if (i<=1) {
            print(arr, ans+"V", i+1, j);
            
        }
        if (j<=1) {
            print(arr, ans+"H", i, j+1);
            
        }
       
       
        
    }
    
    
}
    

