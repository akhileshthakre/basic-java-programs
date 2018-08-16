import java.util.*;
public class First{



	public static void main(String[] args) {

		int counter1 = 0;
		int counter2 = 0;

		Scanner scan =new Scanner(System.in);

		int[] array1 = new int[3];
		int[] array2 = new int[3];

		for(int i = 0;i<3;i++) {

	 		array1[i] = scan.nextInt();

	 	}
	 	for(int i = 0;i<3;i++) {

	 		array2[i] = scan.nextInt();

	 	}

	 	for(int i = 0 ; i<3;i++) {

	 			if(array1[i]>array2[i]){

	 					counter1++;

	 			}else if(array2[i]>array1[i]){

	 					counter2++;

	 			}else if(array1[i]==array2[i]){

	 			}
	 		}
	 	System.out.print(counter1+" ");
	 	System.out.print(counter2+" ");

		


	}
}