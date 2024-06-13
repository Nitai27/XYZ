package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n =5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int tailfactorial(int n,int ans){
        if (n==0) {
            return ans;
        }
        return tailfactorial(n-1,ans*n);
    }
    
}
