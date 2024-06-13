package Secret;
import java.util.*;

public class Coin_permutation {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        int arr[] = {2,3,6,7};
        int t =7;
        print(arr,t,0,ll,0,list);
        System.out.println(list);
      
    }

    private static void print(int[] arr, int t, int sum,  List<Integer> ll,int idx, List<List<Integer>> list) {
        if (sum==t) {
          list.add(new ArrayList<>(ll));
            return;
        }
        if(sum>t){
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            ll.add(arr[i]);
            print(arr, t, sum+arr[i], ll,i,list);
            ll.remove(ll.size()-1);
        }


    }
}
