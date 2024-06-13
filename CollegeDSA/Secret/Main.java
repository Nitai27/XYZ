package Secret;
public class Main {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int t =3;
		print(arr,t,"",0,0);
		
	
	}

	private static void print(int[] arr, int t, String str,int sum,int i) {
		if (sum==t) {
			System.out.print(str+" ");
			return;
		}
		if (i==arr.length) {
			return;
		}
		print(arr, t, str+arr[i], sum+arr[i], i+1);
		print(arr, t, str, sum, i+1);

	}

	

	
	
}