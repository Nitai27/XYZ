package Recursion;

import java.util.ArrayList;

public class MonuLexo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 13;
        for (int i = 0; i <=9; i++) {
            count(n,0);
        }
    }

    private static void count(int n, int curr) {
       if (curr>n) {
        return;
        
       }
       System.out.println(curr);
       int i=0;
       if (curr==0) {
        i=1;
       }
       for (; i <=9; i++) {
        count(n, curr*10+i);
        
       }
    }
}
