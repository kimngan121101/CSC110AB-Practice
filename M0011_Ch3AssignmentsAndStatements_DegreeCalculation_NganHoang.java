package Extra_Credit;
import java.util.Scanner;

public class M0011_Ch3AssignmentsAndStatements_DegreeCalculation_NganHoang {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		double degreesC, degreesF;
		
		System.out.println("Please enter Degrees in Fahrenheit (at least 2 integers) : ");
		degreesF = scnr.nextDouble();
		degreesC = 5*(degreesF-32)/9;
		
		System.out.printf("%.0f degrees Fahrenheit is %.1f degrees Celsius.",degreesF, degreesC);

		
		
		scnr.close();
		
		/***************** The End ****************/
	}

}
