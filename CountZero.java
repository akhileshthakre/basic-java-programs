import java.util.*;
class CountZero {
	public static void main(String[] args) {
		int  a = (Integer)0x001F;
		int count = 0;
		String s = "";
		s  = Integer.toString(a);
		System.out.println(s);
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)== '0') {
				count += 1;
			}
		}
		System.out.println(count);
	}
}