package Extra_Credit;
import java.util.Scanner;
public class M0100_Ch4Branches_Check_fee {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to check's services\n\nPlease enter the check amount : ");
		double userInput = scnr.nextDouble();
		
		if (userInput <10)
			System.out.println("The fee is $1");
		else if (userInput>=10 && userInput <100 ) {
			userInput = userInput * 0.1;
			System.out.println("The fee is $"+ userInput);}
		else if (userInput >= 100 && userInput <1000) {
			userInput = userInput* 0.05 + 5;
			System.out.println("The fee is $"+ userInput);}
		else {
			userInput = userInput* 0.01+ 40;
			System.out.println("The fee is $" + userInput);
		}
		System.out.println("\nThank you for using us!");
		
		scnr.close();
	}

}
