package Recursion;

import java.util.ArrayList;

public class SubsetLc {
   public static void main(String[] args) {
    int arr[] = {4,4,4,1,4};
    print(arr,0,new ArrayList<>());
   }

private static void print(int[] arr, int lp, ArrayList list) {
    System.out.println(list);
    
    for (int i = lp; i < arr.length; i++) {
        // if (i!=lp && arr[i]!=arr[i-1]) {
        //     continue;
        // }
        list.add(arr[i]);
       print(arr, i+1, list); 
       while (i<arr.length-1 && arr[i]==arr[i+1]) {
        i++;
        
       }
       list.remove(list.size()-1);
    }
    
} 
}
