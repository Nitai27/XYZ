package BinarySearch;
// 1
// 5 3
// 1
// 2
// 8
// 4
// 9
// Output:

// 3
import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(LargestMinimumDistance(arr,c));
        
    }
    public static int LargestMinimumDistance(int arr[],int c){
        int low =0;
        int high = arr[arr.length-1]-arr[0];
        int ans =0;
        while (low<=high) {
            int mid = (low+high)/2;
            if (isitpossible(arr,c,mid)==true) {
                ans=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
            
        }
        return ans; //prata
        //book allocation
        // koko eating banna

    }
    private static boolean isitpossible(int[] arr, int c, int mid) {
        int cow=1;
        int pos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-pos>=mid) {
                cow++;
                pos=arr[i];
                
            }
            if (cow==c) {
                return true;
                
            }
            
        }
        return false;


    }
    
}
