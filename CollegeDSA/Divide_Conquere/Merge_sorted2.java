package Divide_Conquere;
import java.util.*;

public class Merge_sorted2 {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,12};
        int arr2[] = {3,5,6};
        merge(arr,arr2);
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;
        int ans[] = new int[arr.length+arr2.length];
        while (i<arr.length || j<arr2.length) {
            if (j==arr2.length || arr[i]<arr2[j]) {
                ans[k]=arr[i];
                k++;
                i++;
            }
            else if (i==arr.length || arr2[j]<arr[i]) {
                ans[k]=arr2[j];
                j++;
                k++;
            }
            
        }
        return ans;
    }
}
