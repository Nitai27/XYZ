package Divide_Conquere;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,12};
        int arr2[] = {3,5,6};
        merge(arr,arr2);
    }

    private static void merge(int[] arr, int[] arr2) {
      int ans [] = new int[arr.length+arr2.length];
      int i=0;
      int j=0;
      int k=0;
      
      while (i<arr.length && j<arr2.length) {
        if (arr[i]<arr2[j]) {
            ans[k]=arr[i];
            i++;
            k++;
        }
        else{
            ans[k]=arr[j];
            j++;
            k++;
        }
      }
      
      while (i<arr.length) {
        ans[k]=arr[i];
        i++;
        k++;
      }
      while (j<arr2.length) {
        ans[k]=arr2[j];
        j++;
        k++;
      }
      System.out.println(Arrays.toString(ans));
    }
    
}
