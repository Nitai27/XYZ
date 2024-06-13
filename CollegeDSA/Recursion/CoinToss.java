package Recursion;

public class CoinToss {
    public static void main(String[] args) {
        int n=3;
        
        System.out.println(cointoss(n, ""));
    }
    public static int cointoss(int n,String ans){
        if (n==0) {
        System.out.println(ans);
            return 1;
        }
        int a =cointoss(n-1, ans+"H");
        int a1 =cointoss(n-1, ans+"T");
        return a+a1;
    }
    public static void cointoss2(int n,String ans){
        if (n==0) {
            System.out.println(ans);
            return;
        }
        if (ans.charAt(ans.length()-1)=='H') {
            cointoss(n-1, ans+"H");
            
        }
        cointoss(n-1, ans+"T");
    }
    
}
