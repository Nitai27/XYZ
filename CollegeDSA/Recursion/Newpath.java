package Recursion;
public class Newpath {
    static int count=0;
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        print(arr,"",0,0);
        System.out.println(count);
    }
    private static void print(int[][] arr, String ans, int row, int column) {
        if(row== arr.length-1 && column==arr[0].length-1){
            count++;
            System.out.println(ans);
            return;
        }
        if(row<0 || column<0 || row>= arr.length || column>= arr[0].length || arr[row][column]==1)
            return;
        // int[]r={0,1,0,-1};
        // int[]c={1,0,-1,0};
        // arr[row][column]=1;
        // for(int i=0;i<c.length;i++){
        //     print(arr,ans+"V",row+r[i],column+c[i]);
        // }
        // arr[row][column]=0;
        // arr[row][column] =1;
        // print(arr, ans+"V", row+1, column);
        // print(arr, ans+"H", row, column+1);
        // print(arr, ans+"V", row-1, column);
        // print(arr, ans+"H", row, column-1);
        // arr[row][column] = 0;


    }
}