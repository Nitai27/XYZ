package Recursion;

public class Power {
    public static void main(String[] args) {
        int a =11111;
        int b=3;
        System.out.println(merapow(a,b));
    }

    private static int power(int a, int b) {
     if (b==0) {
        return 1;
     }
     int sp = power(a, b-1);
     int bp = sp*a;
     return bp; 
    }
    public static int merapow(int a,int b){
        if (b==1) {
            return a;
        }
        return a*merapow(a,b-1);
    } 
}
