import java.util.Scanner;
class CheckPrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;

		for(int i = 2;i<=n/2;++i) {
			if(n%i==0) {
				count++;
				break;
			}
			
		}
		if(count== 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}