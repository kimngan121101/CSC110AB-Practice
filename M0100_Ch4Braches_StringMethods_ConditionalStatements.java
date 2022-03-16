package Extra_Credit;
import java.util.Scanner;
public class M0100_Ch4Braches_StringMethods_ConditionalStatements {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter sentence ends with punctuation mark : ");
		String userInput = scnr.nextLine();
		int x ;
		char lastchar = userInput.charAt(userInput.length()-1);
		userInput = userInput.substring(0, userInput.length()-1).replace(" ", "");
		x = userInput.length()%2;
		
		switch (lastchar) {
		case '?':
			if (x == 0)
				System.out.println("Good question");
			else 
				System.out.println("What an odd question?");
			break;
		case '!':
			System.out.println("Got it!");
			break;
		default :
			System.out.println("Is that your new motto?");
			break;
		}	
		scnr.close();
	}

}
