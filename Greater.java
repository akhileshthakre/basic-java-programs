import java.lang.Math;
class Greater {

	public static void main(String[] args) {

		int x= 5;
		int y = 5;
		
		if(Math.pow(x,y) > Math.pow(y,x)) {
			System.out.println("x^y" + Math.pow(x,y));
			System.out.println("y^x" + Math.pow(y,x));
			System.out.println( "x^y is greater");
		}
		else if(Math.pow(x,y) < Math.pow(y,x)) {
			System.out.println("x^y" + Math.pow(x,y));
			System.out.println("y^x" + Math.pow(y,x));
			System.out.println("y^x is greater");
		}
		else if(Math.pow(x,y) == Math.pow(y,x)) {
			System.out.println("x^y" + Math.pow(x,y));
			System.out.println("y^x" + Math.pow(y,x));
			System.out.println("Both are equal");
		}



	}
}