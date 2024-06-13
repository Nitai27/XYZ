package Recursion;

public class Dice {
    public static void main(String[] args) {
        int n =4;
        print(n,0,"");
    }

    private static void print(int n, int i, String s) {
        if (n==i) {
            System.out.println(s);
            return;
        }
        if (n<i) {
            return;
        }
        print(n, i+1, s+"1");
        print(n, i+2, s+"2");
        print(n, i+3, s+"3");
       
    }
}
