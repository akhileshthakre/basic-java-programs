import java.util.*;
class DuplicatesRemoveFromArray {
	public static void main(String[] args) {
		int[] a = {10,20,20,30,1,1,2,1,4};
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		for (int i = 0;i<a.length ;i++ ) {
			hs.add(a[i]);
		}
		System.out.println(hs);

		
	}
}