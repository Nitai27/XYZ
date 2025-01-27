package Secret;

/**
 * Palindrome_partition
 */
import java.util.*;
public class Palindrome_partition {

    public static void main(String[] args) {
        String str = "aab";
        ArrayList<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        print(str,list,ans);
        System.out.println(ans);
    }

    private static void print(String str,  ArrayList<String> list, List<List<String>> ans) {
        if (str.length()==0) {
          ans.add(new ArrayList<>(list));
           return; 
        }
        for (int i = 1; i <= str.length(); i++) {

          String c = str.substring(0, i);
          if (ispossible(c)) {
            list.add(c);
            print(str.substring(i), list,ans);
            list.remove(list.size()-1);
            
          }
       
            
        }

    }

    private static boolean ispossible(String c) {
    int i=0;
    int j = c.length()-1;
    while (i<j) {
        if (c.charAt(i)!=c.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}