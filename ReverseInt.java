class ReverseInt {
	static void m1(int n) {
		int reverse = 0;

		while(n!=0) {
		reverse = reverse * 10;
		reverse = reverse + n%10;
		n = n/10;
	}

	System.out.println(reverse);


	}
	public static void main(String[] args) {
		
		m1();	
	}
}