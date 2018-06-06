class PalindromeSolution {

	static void m1(String str) {
		String str1 ="";
		for (int i = str.length()-1;i>=0  ;i-- ) {
			
			str1 = str1 + str.charAt(i);

		}
		if(str1.equals(str)) {
			System.out.println(str1);
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println(str1);
			System.out.println("String is not Palindrome");
		}
	}

	public static void main(String[] args) {
		String s = "123211";
		m1(s);
	}
}