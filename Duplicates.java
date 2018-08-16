import java.util.*;
public class Duplicates {

	public static void main(String[] args) {		
		Scanner scan= new Scanner(System.in);
		String str = new String();
		str = scan.nextLine();
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i=0;i<n ;i++ ) {
			arr[i] = scan.nextInt();
		}
		int length = removeDuplicate(arr,n);

		for (int i=0;i<length;i++ ) {
			System.out.print(arr[i]+" ");	
		}

	}

	 static public int removeDuplicate(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp = new int[n];
		int k = 0;

		for (int i=0;i<n-1 ;i++ ) {
			if(arr[i]!=arr[i+1]) {
				temp[k++] = arr[i];
			}
		}
		 temp[k++] = arr[n-1]; 

		for (int j=0;j<temp.length ;j++ ) {
			arr[j] = temp[j];
		}
		return k;
	}
}