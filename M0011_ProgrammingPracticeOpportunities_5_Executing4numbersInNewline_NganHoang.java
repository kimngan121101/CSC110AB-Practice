package Extra_Credit;
import java.util.Scanner;

public class M0011_ProgrammingPracticeOpportunities_5_Executing4numbersInNewline_NganHoang {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter four-digit integer : ");
		String num = scnr.nextLine();
		
		System.out.println(num.charAt(0));
		System.out.println(num.charAt(1));
		System.out.println(num.charAt(2));
		System.out.println(num.charAt(3));

		scnr.close();
		
		/************** The End *************/
	}

}
