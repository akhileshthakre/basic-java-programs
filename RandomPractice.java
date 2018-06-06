import java.util.*;

// reverse the  number
public class RandomPractice {

 	public static void main(String[] args) {

		int number=0,reverse = 0;
 		Scanner scan = new Scanner(System.in);
 		number = scan.nextInt();

 		while(number != 0) {
 			reverse = (reverse*10) + (number%10);
 			number = number / 10; 
 		}
 		System.out.println(reverse);
 	}
 }