package Recursion;

public class LastIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2};
        int target = 2;
        System.out.println(lastlinearSearch(arr, arr.length-1, target));
    }
    public static int lastlinearSearch(int arr[],int idx,int target){
        if (idx==-1) {
            return -1;
        }
        if (arr[idx]==target) {
            return idx;
        }
        return lastlinearSearch(arr, idx-1, target);
    }
}
