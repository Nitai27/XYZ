package Recursion;

public class PrintingNum {
    public static void main(String[] args) {
        int n =5;
        print1(n);
    }
    public static void print(int n){
        if (n==0) {
            return;
        }
        System.out.println(n); // 54321
     print(n-1);
        
    } 
    public static void print1(int n){
        if (n==0) {
            return;
        }
        print1(n-1);
        System.out.println(n);
     
        
    } 
}
