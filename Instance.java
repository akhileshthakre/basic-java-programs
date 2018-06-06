class Ins {

	 static void main() {
		System.out.println("Hello World");
	}

	// static void main(int a) {
	// 	System.out.println("Hello World111");
	// }

}
class M extends Ins {

	static void main() {
		System.out.println("Hello Goku");
	}
}
public class Instance {
	public static void main(String[] args) {
	
		Ins i = new M();
		 i.main();
	}

}
