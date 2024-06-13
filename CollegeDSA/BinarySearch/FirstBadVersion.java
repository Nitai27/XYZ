package BinarySearch;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n =5;
        System.out.println(BadVersion(n));
        
    }

    private static int BadVersion(int n) {
        int lo=1;
        int hi=n;
        int ans=0;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (isBadVersion(mid)==true) {
                ans=mid;
                hi=mid-1;
                
            }
            else{
                lo=mid-1;
            }
            
        }
        return ans;
       
    }

}
