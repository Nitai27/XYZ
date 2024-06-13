package BinarySearch;
public class Koko {
    public static void main(String[] args) {
        int p[] = {3,6,7,11};
        int h = 8;
        int start =0;
        int end = p.length-1;
        int sum=0;
        int i=0;
        while (start<=end) {
            int mid = start+(end-start)/2;
            sum+=sum/p[i];
        }
    }
}
