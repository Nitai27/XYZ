package BinarySearch;
public class SquareRoot {
   public static void main(String[] args) {
    int k =63;
    System.out.println(SquareRoot(k));
    
   } 
   public static int SquareRoot(int n){
    int ans =-1;
    int st =1;
    int end = n;
    while (st<=end) {
        int mid = (st+end)/2;
        if (mid*mid<=n) {
            ans =mid;
            st=mid+1;
        }
        else{
            end = mid-1;
        }
        
    }
    return ans;
   }
}
