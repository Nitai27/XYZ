package Recursion;

public class Permutation {
 public static void main(String[] args) {
    String  s = "abc";
 
 printToremove(s, "");
 //permutation 
    
 }

private static void print(String s, String ans) {
    if (s.length()==0) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i < s.length(); i++) {
        String str = s.substring(0, i) + s.substring(i+1);
        print(str, ans+s.charAt(i));
    }
}  
private static void printToremove(String s1, String ans) {
    if (s1.length()==0) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i <s1.length(); i++) {
        
    boolean flag = false;
        char ch = s1.charAt(i);
        for (int j = i+1; j < s1.length(); j++) {
            if (ch==s1.charAt(j)) {
                flag=true;
                
            }
            
        }
        if (flag==false) {
          
            print(s1.substring(0, i) + s1.substring(i+1), ans+s1.charAt(i));
        }
       
    }
} 
}
