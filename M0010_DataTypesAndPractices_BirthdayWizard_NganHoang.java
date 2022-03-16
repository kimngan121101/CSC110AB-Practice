package Extra_Credit;
import java.util.Scanner;

public class M0010_DataTypesAndPractices_BirthdayWizard_NganHoang {

	public static void main(String[] args) {
		Scanner scnr= new Scanner(System.in);
		
		int num_of_BD;
		int birth_year;
		
		System.out.println("Enter the year of birth: ");
		
		birth_year= scnr.nextInt();
		
		num_of_BD = 2019 - birth_year;
		
		System.out.println("Congratulations! Your "+num_of_BD+"th birthday.");
		
		scnr.close();
		
		/*************** The End ***************/
	}

}
