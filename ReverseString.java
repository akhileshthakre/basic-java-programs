class ReverseString {

	static String m1(String str) {
		String reversed = "";
		for (int i = str.length()-1; i >=0 ; i-- ) {

			reversed = reversed + str.charAt(i);
			
		}
		return reversed;
	}
	public static void main(String[] args) {
		
		String str1 = m1("HEllo");
		System.out.print(str1);
	}
}