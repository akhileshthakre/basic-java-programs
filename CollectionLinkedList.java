import java.util.*;

public class CollectionLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Goku");
		linkedList.add("Vegeta");
		linkedList.add("Naruto");
		linkedList.add("Natsu");
		linkedList.add("Luffy");

		ListIterator<String> li = linkedList.listIterator();

		while(li.hasNext()) {
			System.out.println(sort(li.next()));
		}
	}
}