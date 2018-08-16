// import java.util.*;
// class ArrayHomogeneousData {
// 	public static void main(String[] args) {
// 		Object[] arr1 = new Object[5];
// 	Scanner scan = new Scanner(System.in);
// 	for (int i = 0;i<arr1.length ;i++ ) {
// 		arr1[i] = scan.next();
// 	}
// 	Arrays.sort(arr1);
// 	for (int j = 0;j<arr1.length ;j++ ) {
// 		System.out.println(arr1[j]);
// 	}
// 	}
	
// }
////////////////////////////////////////////////////////

class ArrayHomogeneousData {
	static public void m1(int n) {
		int[] arr = new int[n];
		arr[0] = 10;
		arr[1] = 20;
		arr[4] = 30;
		for (int i = 0;i<n ;i++ ) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		m1(10);
	}
}