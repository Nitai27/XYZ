package Recursion;

public class LexoCount {
   public static void main(String[] args) {
    int n = 15;
    for (int i = 1; i <=9; i++) {
        print(n, i);
        
    }
    
        //print(n,0);
        
    
   
   }

private static void print(int n, int ans) {
 
    if (ans>n) {
        return;
    }
    // if (ans<=n && ans!=0) {
    //     System.out.println(ans);
        
        
    // }
    System.out.print(ans+" ");
    int i=0;
    if (ans==0) {
        i=1;
        
    }
   
    for (; i < 10; i++) {
        print(n, (ans*10)+i);
        
    }
    
} 
}


