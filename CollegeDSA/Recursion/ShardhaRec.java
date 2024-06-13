package Recursion;

public class ShardhaRec {
   public static void main(String[] args) {
  String s = "abbbb";
  System.out.println(lengthString(s, 0, 0));

    
   } 
   public static void decNum(int n){
    if (n!=0) {
        System.out.println(n);
        decNum(n-1);
    }
   
   }
   public static void IncNum(int n){
    if (n==0) {
        return;
        
    }
    IncNum(n-1);
    System.out.println(n);
   
   }
   public static int sumofn(int n){
    if (n==0) {
        return 0;
    }
    return n+sumofn(n-1); 
    

   

   }
   public static boolean soretdArr(int[] arr,int index){
    if (index==arr.length-1) {
        return true;
    }
    if (arr[index]>arr[index+1]) {
        return false;
    }
    return soretdArr(arr, index+1);

   } 
   public static int firstOccur(int arr[] , int index,int target){
    if (index<0) {
        return -1;
    }
    if (arr[index]==target) {
        return index;
    }
    return firstOccur(arr, index-1, target);
   }
   public static String allOcurr(int arr[],int index,int target,String ans){
    if (index==arr.length) {
        return ans;
    }
    if (arr[index]==target) {
        ans+=index;

        
    }
    return allOcurr(arr, index+1, target, ans);
   }
   public static int lengthString(String ans,int index,int length){
    if (index==ans.length()) {
        return length;
    }
    if (ans.charAt(index)!='?') {
        length++;
        
    }
    return lengthString(ans, index+1, length);

   }

}
