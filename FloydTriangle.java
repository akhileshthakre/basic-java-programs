import java.util.*;
class FloydTriangle {
	public static void main(String[] args) {
		// int n =0;
		// for (int i = 0;i<5 ;i++ ) {
		// 	for (int j = 0;j<=i;j++ ) {
		// 		System.out.print(++n+" ");
		// 	}
		// 	System.out.println();
		// }
		Scanner scan  = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for (int i=m;i<n ; i++) {
			for (int j = 2;j<=i ;j++ ) {
				if(i==j) {
					System.out.print(j+" ");
				}else if(i%j==0) {
					break;
				}
			}
		}
	}
}