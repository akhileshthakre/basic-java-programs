import java.util.*;
class ArrayRepeatingChar {
	public static void main(String[] args) {
		Scanner	scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i=0; i<n; i++) {
			 if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");  
		}

	}
	
}