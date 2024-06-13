package Secret;
import java.util.*;

public class Combination_sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = {2,3,5};
        int t = 8;
        print(arr,t,list,0,ans);
        System.out.println(ans);
    }

    private static void print(int[] arr, int t, ArrayList<Integer> list, int idx,List<List<Integer>> ans) {
        if (t==0) {
            ans.add(new ArrayList<>(list));
            return;
            
        }
        for (int i = idx; i < arr.length; i++) {
            if (t>=arr[i]) {
                list.add(arr[i]);
            print(arr, t-arr[i], list, i,ans);
                list.remove(list.size()-1);
            }
            
            
        }
        
    }
    
}
