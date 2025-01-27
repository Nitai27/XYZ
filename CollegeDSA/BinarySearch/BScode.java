package BinarySearch;

public class BScode {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
      System.out.println(binarySearch(arr, 15));
        
    }
    public static int binarySearch(int arr[],int target){
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
        return -1;
    }
    public static int sqrt(int num){
        int start=0;
        int end = num;
        int ans =0;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid*mid<=num) {
                ans =mid;
                start=mid+1;
                
            }
          
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
