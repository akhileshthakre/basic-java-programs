import java.util.Scanner;
class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int temp;

		for (int i = 0;i<n;i++ ) {
			arr[i] = scan.nextInt();
		}

		for (int i =0; i<arr.length;i++ ) {
			for(int j = 1;j<(arr.length - i); j++) {
				
				if(arr[j-1]>arr[j]) {
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
			}
			
		}
		for (int j = 0;j<arr.length ;j++ ) {
			System.out.println(arr[j]);
		}
	}
}