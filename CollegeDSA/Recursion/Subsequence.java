package Recursion;

public class Subsequence {
    public static void main(String[] args) {
        String ques = "AAABBC";
    PrintSubSeq(ques, "");
    System.out.println(CountSubSeq(ques, ""));
    }
    static int count=0;
    public static void PrintSubSeq(String ques,String ans){
        if (ques.length()==0) {
            System.out.println(ans);
            count++;
            return;
            
        }
        char c = ques.charAt(0);
        PrintSubSeq(ques.substring(1), ans);
        PrintSubSeq(ques.substring(1), ans+c);

    }
    public static int CountSubSeq(String ques,String ans){
        if (ques.length()==0) {
            return 1;
             }
        char c = ques.charAt(0);
      int a = CountSubSeq(ques.substring(1), ans);
      int b = CountSubSeq(ques.substring(1), ans+c);
      return a+b;

    }
    
  

    }
    


