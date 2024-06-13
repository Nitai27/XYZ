package Secret;

public class String_permuation2 {
    public static void main(String[] args) {
        String str = "abca";
        print(str,"");
        
    }

    private static void print(String str, String ans) {
       if(str.length()==0){
        System.out.println(ans);
        return;
       }
       for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        boolean val = true;
        for (int j = i+1; j < str.length(); j++) {
            if(str.charAt(j)==c){
                val = false;
                break;
            }
            
        }
        if(val==true){
            String s1 = str.substring(0,i);
            String s2 = str.substring(i+1);
            print(s1+s2, ans+c);
        }
       }
    }
}
