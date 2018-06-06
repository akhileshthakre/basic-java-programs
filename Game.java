import java.util.*;
class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c;
		int random;
		do {
		int max =3;
		int min =1;
		Random randomNum = new Random();
		random = min + randomNum.nextInt(max);
		System.out.println("Choose your Option");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Siccsor");
		int n = scan.nextInt();
		switch(n) {
			case 1:
				System.out.println("Computer Generated random number is:" + random);
				if(n==random) {
					System.out.println("Match Draw");
				}else if(n<random) {
					int a = random;
					if(n < a-1) {
					System.out.println("hurray!!! You wins");
					}else {
						System.out.println("Computer Win");
					}
				}
				break;
			case 2:
				System.out.println("Computer Generated random number is:" + random);
				if(n==random) {
					System.out.println("Match Draw");
				}else if(n>random) {
					int a = random;
					if(n < a+1) {
					System.out.println("Computer Win");
					}else {
						System.out.println("hurray!!! You wins");
					}
				}else {
					System.out.println("Computer Wins");
				}
				break;
			case 3:
				System.out.println("Computer Generated random number is:" + random);
				if(n==random) {
					System.out.println("Match Draw");
				}else if(random==2) {
					System.out.println("hurray!!! You wins");
				}
				else if(random==1) {
					System.out.println("Computer Wins");
				}
				break;
		}
		System.out.println("Do u want to continue(y or n)");
		c = scan.next().charAt(0);}while(c=='Y' || c=='y');	
		System.out.println(random);
	}
}