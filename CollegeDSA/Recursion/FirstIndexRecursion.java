package Recursion;

public class FirstIndexRecursion {
    public static void main(String[] args) {
        int arr[] = {3,2,2,1,2};
        int t =1;
        // output =1;
        // last index bhi search kar lena
        System.out.println(phelibaar(arr, 0, t));

    }
    public static int linearSearch(int arr[],int idx,int target){
        if (idx==arr.length) {
            return -1;
        }
        if (arr[idx]==target) {
            return idx;
        }
        return linearSearch(arr, idx+1, target);
    }
    public static int phelibaar(int arr[],int idx,int target){
        if (idx==arr.length) {
            return -1;
        }
        if (arr[idx]==target) {
            return idx;
            
        }
        return phelibaar(arr, idx+1, target);
    } 
}
