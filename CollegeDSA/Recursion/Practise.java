package Recursion;

/**
 * Practise
 */
import java.util.*;
public class Practise {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int arr[]= {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), arr);
       System.out.println(list);
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int a = 0; a < nums.length; a++){
                if(tempList.contains(nums[a])) continue;
                tempList.add(nums[a]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }
}
}