import java.util.*;
class CollectionPractice {
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////
		// Vector<Object> v = new Vector<>();
		// System.out.println("IsEmpty: "+v.isEmpty());
		// v.add("a");
		// v.add("b");
		// v.add("c");
		// v.add(1);
		// for(int i = 0;i<v.size();i++) {
		// 	Object obj = v.get(i);
		// 	String str = (String) obj;
		// 	System.out.println(str.toUpperCase());
		// }
		// System.out.println("IsEmpty: "+v.isEmpty());

		// System.out.println(v);
		////////////////////////////////////////////////////////////////////

		HashSet<Object> hs = new HashSet<>();              
		hs.add("e");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("-1");
		hs.add("d");
		hs.add(4);

		System.out.println(hs);


	}
}