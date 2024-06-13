package BinarySearch;
public class CelingandFloor {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    
    }
    public static int ceiling(int arr[],int target){
        if (target>arr[arr.length-1]) {
            return -1;
            
        }
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target) {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
            
        }
        return arr[start];
    }
    public static int floor(int arr[],int target){
        
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target) {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
            
        }
        return arr[end];
    }
}
