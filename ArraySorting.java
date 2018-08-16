import java.util.*;
class ArraySorting {
	public static void main(String[] args) {
		int[] arr = new int[]{5,2,1,6,8,4};
		Arrays.sort(arr);
		for (int i =0 ;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
}