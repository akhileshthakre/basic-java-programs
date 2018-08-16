import java.util.*;
class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("1");
		al.add("wello");
		al.add("3");
		al.add("2");
		al.add("b");
		al.add("a");

		// Iterator itr = al.iterator();

		// while(itr.hasNext()) {
		// 	System.out.println(itr.next());	
		// }
		Collections.sort(al);
		for(Object str: al) {
			System.out.println(str);
		}
	}
}