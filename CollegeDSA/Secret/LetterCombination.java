package Secret;

public class LetterCombination {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    public static void main(String[] args) {
        String q  = "23";
        //print(q,"");
        //System.out.println('b'-'a');
    }
    private static void print(String q, String ans) {
    if(q.length()==0){
        System.out.print(ans+" ");
        return;
    }
    char c = q.charAt(0);
    int num = c-'0';
    String press = map[num];
    for (int i = 0; i < press.length(); i++) {
        print(q.substring(1), ans+press.charAt(i));
        
    }
    }
}
