import java.util.*;
public class BinarySearch {

	static void m1() {

		int n,key;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] a = new int[n];

		System.out.println("Enter the intergers");
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the number u want to search");
		key = scan.nextInt();

			int start = 0;
			int end = n-1;
			int mid;

			
			
			while(start<=end) {
				mid = (start + end) / 2;

			if(a[mid]==key) {

				System.out.println("Key found");
				System.out.println("Index of Key is "+mid);
				break;

			}else if(key < a[mid]) {

				end = mid-1;

			}else {

				start = mid+1;
			}
		}

	}

	public static void main(String[] args) {
		 m1();

	}
}