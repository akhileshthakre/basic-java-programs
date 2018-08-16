import java.util.*;
class CharacterReplacementFromString {
	public static void main(String[] args) {
	///////////////////////////////////////////////////// method 1 for remove duplicate/////////////////
	// 	String str = "geekgs";
	// 	char[] temp = str.toCharArray();
	// 	Arrays.sort(temp);
	// 	int k = 1;int k1 = 1;

	// 	while(k1!=temp.length) {
	// 		if(temp[k1]!=temp[k1-1]) {
	// 			temp[k] = temp[k1];
	// 			k++;
	// 		}
	// 		k1++;
	// 	}

	// 	String s = new String(temp);
	// 	System.out.println(s.substring(0,k));
	// }
	////////////////////////////////////////////////////
		LinkedHashSet<Character> ls = new LinkedHashSet<>();
		String str = "helloworld";

		for (int i=0;i<str.length() ;i++ ) {
			ls.add(str.charAt(i));
		}
		
		int i = 0;
		char[] c1 = new char[str.length()-1];
		for(Character c : ls) {
			i = (c*c)%str.length();

			for (int j=0;j<ls.size() ;j++ ) {
				c1[j] = str.charAt(i);
				System.out.print(c1[j]);
				break;
			}
			i = 0;
		}



		
	}
	
}