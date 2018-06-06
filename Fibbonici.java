class Fibbonici {

	 static int m1(int n) {
	 		if(n==1 || n ==2) {
				return 1;
			}
			return m1(n-1) + m1(n-2);
			
	}
	public static void main(String[] args) {

		int n = 12;

		for (int i =1;i<=n ;i++ ) {
			System.out.println(m1(i));
		}
	}
}