package Arrays;

import java.util.Arrays;

public class ReversalAlgo {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7};
        int k=3;
       Rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void Rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        Reverse(arr,0,n-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n-1);
    }
    public static void Reverse(int arr[],int i,int j){
        int n = arr.length;
        while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        
    }
    
}
