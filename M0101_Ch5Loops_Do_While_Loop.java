package Extra_Credit;
import java.util.Scanner;
public class M0101_Ch5Loops_Do_While_Loop {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		String repetition;
		double [] info = new double [2];
		double h, c;
		final double Pi = 3.14;
		
		System.out.println("Coca Cola Company\n");
		
		do {
			
			System.out.println("Please enter volume and radius seperated by space : ");
			for (int i = 0 ; i< 2; i++)
				info [i] = scnr.nextDouble();
			
				h = info[0]/ (Pi * Math.pow(info[1], 2));
				
				c = 2 * Pi * info[1] * (info[1]+h);
				
			System.out.printf("The height of the container %.5f\nThe Cost of container %.2f\n", h,c);
			scnr.nextLine();
			
			System.out.println("Enter \"yes\" to continue otherwise end the program.");
			repetition = scnr.nextLine();
			
		} while (repetition.equalsIgnoreCase("yes"));
		
		
		
		
		
		scnr.close();
	}

}
