package BinarySearch;
public class Book_allocation {
    public static void main(String[] args) {
         int [] pages = {10,20,30,40};
         int nos = 2 ;
         System.out.println(MinPages(pages, nos));


    }
    public static int MinPages(int[]pages,int nos){
        int lo =0;
        int hi=0;
        for (int i = 0; i < pages.length; i++) {
            hi+=pages[i];
        }
        int ans=0;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (isitpossible(pages,nos,mid)==true) {
                ans=mid;
                hi=mid-1;
                
            }
            else{
                lo=mid+1;
            }
            
            
        }
        return ans;

    }
    private static boolean isitpossible(int[] pages, int nos, int mid) {
        int student =1;
        int readpage =0;
        for (int i = 0; i < pages.length; i++) {
            if (readpage+pages[i]<=mid) {
                readpage+=pages[i];
                
            }
            else{
                readpage=0;
                student++;
            }
            if (student>nos) {
                return false;
                
            }
        }
        return true;
         
    }
}
