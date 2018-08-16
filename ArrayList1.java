import java.util.*;
class ArrayList1 {

	public static void main(String[] args) {
	List<String> a = new ArrayList<String>();
	a.add("1");
	a.add("Akhilesh");
	a.add("Akhil");
	a.add("Kame");
	a.add("Deepak");
	a.add("###");
	a.add("***");
	a.add("%%%");
	a.add("&&&");

	Collections.sort(a);

	Iterator itr = a.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	
}