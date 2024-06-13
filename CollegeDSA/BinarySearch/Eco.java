package BinarySearch;
public class Eco {
    public static void main(String[] args) {
       int [] arr = {10,15,17,20};
       int st =0;
       int end = arr[arr.length-1];
       int ans =0;
       while (st<=end) {
        int mid = st+(end-st)/2;
        if (isItPossible(mid,arr,wood)) {
            ans =mid;
            st = mid+1;
        }
        else{
            end = mid-1;
        }
        
       }
       System.out.println(ans);

    }
    public static boolean isItPossible(int mid,int[] arr,int wood){
        int twood =0;
        for (int i : arr) {
            if (i>mid) {
                twood+=i-mid;
            }
        }
        if (twood>=wood) {
            return true;
        }
        return false;//87574 aggcow last position first position //1552

    }
}
