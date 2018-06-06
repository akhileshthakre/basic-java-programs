import java.util.*;
import java.io.*;

public class NumberConvertor {

	public static void main(String[] args) throws Exception{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter from following for conversion");
		String s = new String();
		int no;
		int dec,a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Octal to Decimal");
		System.out.println("3. Hex to Decimal");
		System.out.println("4. Decimal to Binary");
		System.out.println("5. Decimal to Octal");
		System.out.println("6. Decimal to Hex");
		System.out.println("7. Binary to Hex");
		System.out.println("8. Binary to Octal");
		System.out.println("9. Octal to Binary");
		System.out.println("10. Octal to Hex");
		System.out.println("11. Hex to Binary");
		System.out.println("12. Hex to Octal");

		System.out.print("Please enter the choice ");
		choice=scan.nextInt();
		
		switch(choice) {

			case 1:
				System.out.println("Enter Binary Number ");
				s = br.readLine();
				 no = Integer.parseInt(s,2);
				System.out.println(no);
				break;

			case 2:
				System.out.println("Enter Octal Number ");
				s = br.readLine();
				 no = Integer.parseInt(s,8);
				System.out.println(no);
				break;

			case 3:
				System.out.println("Enter Hex Number ");
				s = br.readLine();
				no = Integer.parseInt(s,16);
				System.out.println(no);
				break;

			case 4:
				s = "";
				int count = 0;
				System.out.println("Enter Drcimal number to convert to binary Number ");
				dec = scan.nextInt();
				if(dec==0){

					s = "0";
				}
				while(dec>0) {
					a=dec%2;
					if(a==1){
						count++;
					}
					s = s+""+a;
					dec=dec/2;
				}
				System.out.print(s);
				break;
			}




	}
}