package Recursion;

import java.util.Arrays;

public class AllOcurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2};
        int target = 2;
        System.out.println(Arrays.toString(Find(arr, target, 0, 0)));
    }
    public static int[] Find(int[] arr, int target,int idx,int count){
        if (idx==arr.length) {
            return new int[count];
        }
        if (arr[idx]==target) {
            count++;
            
        }
        int ans[] = Find(arr, target, idx+1, count);
        if (arr[idx]==target) {
            ans[count-1]=idx;
            
        }
        return ans;
    } 
 
}
