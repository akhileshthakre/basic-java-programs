import java.util.*;
public class Tree {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int k = scan.nextInt();

			int[] a = new int[n-1];
			int[] b = new int[n-1];
			int[] c = new int[n-1];
			int[] d = new int[n-1];

			int counter = 0;
			int z = 0;

			for (int i = 0 ; i<n-1 ; i++ ) {

					a[i]=scan.nextInt();
					c[i] = a[i];
					b[i] = scan.nextInt();
					d[i] = b[i];
			}

			for(int i = 0 ; i<n-1 ; i++) {

					if(a[i] == b[i]){

						break;
					}
					if(a[i] <= 50000 && b[i] <= 50000){

							if(a[i] != b[i]) {
						
							//	c[i] = b[i];

								for(int j =0; j<n-1 ; j++) {

									if(b[i] == a[j]) {

										//counter = counter + 1;
										z = b[j]-a[i];

									}

										if(z==k || z==4) {

											counter = counter + 1;
										}


									
								}

							}
						


					}

			}

			System.out.println(counter);


	}
}