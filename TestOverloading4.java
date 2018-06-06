
import java.util.*;

public class TestOverloading4 {  

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Hello[] h2 = new Hello[10];
		Hello[] a = new Hello[10];

		for(int i =0;i<10;i++) {
				
				a[i] = ((Integer)i);
		}


		for(int i = 0; i<10; i++) {

			a[i] = new Hello();

			a[i].setName(scan.nextLine());
		}
		for(int i = 0; i<10; i++) {

			System.out.println(h2[i]);
		}
	}  

}  

class Hello {

	private String name;

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}


}