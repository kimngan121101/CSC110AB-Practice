package Extra_Credit;
import java.util.Scanner;

public class M0011_ProgrammingPracticeOpportunities_4_ProgrammingAverageof3WholeNumbers_NganHoang {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num1 , num2 , num3  ;
		double ave;
		
		System.out.println("Please enter first number ");
		num1 = scnr.nextInt();
		
		System.out.println("Please enter second number ");
		num2 = scnr.nextInt();
		
		System.out.println("Please enter third number ");
		num3 = scnr.nextInt();
		
		ave = (num1 + num2 + num3)/3.0;
		
		System.out.println("The average is "+ ave);
		
		scnr.close();
		
		/*************** The End *****************/
	}

}
