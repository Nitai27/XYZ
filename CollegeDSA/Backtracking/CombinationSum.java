package Backtracking;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int [] arr = {2,3,5};
        int target = 8;
        ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>(null);
        print(arr,target,list,ans);
    }

    private static void print(int[] arr, int target, ArrayList<Integer> list,  ArrayList<List<Integer>> ans) {
        if (target==0) {
            System.out.println(list);
            ans.add(list);
            return;
        }
        // if (target<0) {
        //     return;
        // }
        
        for (int i = 0; i < arr.length; i++) {
            if (target>=arr[i]) {
                list.add(arr[i]);
                print(arr, target-arr[i], list,ans);
                list.remove(list.size()-1);
                
            }
           
            
        }
    }
    
}
