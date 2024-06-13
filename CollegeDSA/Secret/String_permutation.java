package Secret;
import java.util.*;

public class String_permutation {
   
    public static void main(String[] args) {
        
     
        String s = "abca";
        print(s, "");
      
    }

    private static void print(String s, String ans) {
        if (s.length()==0) {
           System.out.println(ans);
           
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s1 = s.substring(0, i);
            String s2 = s.substring(i+1);
            print(s1+s2, ans+c);
            
        }

    }
}
