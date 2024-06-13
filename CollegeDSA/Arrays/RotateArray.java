package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;
        Rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    private static void Rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        for (int j = 1; j <= k; j++) {
            int item = arr[n-1];
            for (int i = n-2; i >= 0; i--) {
                arr[i+1]=arr[i];
                
            }
            arr[0]=item;
        }
       
    }

    
}
