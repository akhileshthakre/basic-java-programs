import java.util.*;
class Inventory {
	
	int musicCD;
	int filmCD;
	int gameCD;
	int intitialMCDCount =5;
	int intitialFCDCount =5;
	int intitialBCDCount =5;
	boolean mCD = false;
	boolean gCD = false;
	boolean fCD = false;
	public int refillCountMCD() {

		return intitialMCDCount;

	}
	public int refillCountFCD() {

		return intitialFCDCount;
		
	}
	public int refillCountGCD() {
		
		return intitialBCDCount;
	}

	public void initialMCDCount() {
		initialMCDCost = initialMCDCost + initialMCDCost; 

	}
	public void initialFCDCount() {
		initialFCDCost = initialFCDCost + initialFCDCost; 

	}
	public void initialGCDCount() {
		initialGCDCost = initialGCDCost + initialGCDCost; 

	}

}
class Customer extends Inventory{
	private int cusID;
	private String cusName;

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusID() {
		return cusID;
	}
	public String getCusName() {
		return cusName;
	}

	// public int getCount() {

	// 	if(intitialMCDCount<=1) {

	// 		updateMCDCash();
	// 		refillCountMCD();
			
	// 	}
	// 	if(intitialFCDCount<=1) {

	// 		updateFCDCash();
	// 		refillCountFCD();
			
	// 	}
	// 	if(intitialGCDCount<=1) {

	// 		updateGCDCash();
	// 		refillCountGCD();
			
	// 	}
	// }
	public void choose() {

	 switch(n){

		case 1:
			mCD = true;
			break;
		case 2:
			gCD = true;
			break;
		case 3:
			fCD = true;
			break;
		default:
			System.out.println("Enter valid Input");

	 }

	 	if(mCD==true){
	 		updateMCDCash();
	 		intitialMCDCount = intitialMCDCount -1;
	 	}
	 	if(gCD==true){
	 		updateGCDCash();
	 		intitialGCDCount = intitialGCDCount -1;
	 	}
	 	if(fCD==true){
	 		updateFCDCash();
	 		intitialFCDCount = intitialFCDCount -1;
	 	}

	}

}
class Cash extends Customer {
	double initialMCDCost = 100;
	double initialFCDCost = 200;
	double initialGCDCost = 500;
	double totalProfit;

	// public void setMCDCost(double initialMCDCost){

	// 	this.initialMCDCost = initialMCDCost;
	// }
	// public void setFCDCost(double initialMCDCost){

	// 	this.initialFCDCost = initialFCDCost;
	// }
	// public void setGCDCost(double initialMCDCost){

	// 	this.initialGCDCost = initialGCDCost;
	// }

	public void updateMCDCash(){

		intitialMCDCount();

	}
	public void updateFCDCash(){

		intitialFCDCount();
		
	}
	public void updateGCDCash(){

		intitialGCDCount();
		
	}

}

public class Shop {
	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);

		System.out.println("Welcome the Shop");
		System.out.println("Here you can find different collection of CD's.");
		System.out.println("Music CD");
		System.out.println("Film CD");
		System.out.println("Game CD");
		System.out.println("Choose From below which CD you want to buy");
		System.out.println("1. Music CD");
		System.out.println("2. Film CD");
		System.out.println("3. Game CD");

		Customer c = new Customer();

		String n = "";


		do {

			c.choose();

		}while(n=="YES"||n=="yes"||n=="Yes");
	} 
}