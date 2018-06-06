class Maxchar {
	static char m1(String str) {
		int count[] = new int[256];
		int max = -1;
		char result = ' ';

		for (int i = 0;i < str.length() ; i ++ ) {
			
			count[str.charAt(i)]++;
		}
		for (int i = 0;i < str.length() ; i ++ ) {
			
			if(max < count[str.charAt(i)] ) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(m1("Helloo"));
	}
}