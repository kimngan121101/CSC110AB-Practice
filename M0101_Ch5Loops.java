package Extra_Credit;
import java.util.Scanner;
public class M0101_Ch5Loops {

	// For loop
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Please enter an integer : ");
		int num = scnr.nextInt();
		
		long total = 0;
		
		for (int i = 1; i <= num; i++) 
			total += Math.pow(i, 2); 
		
		System.out.println("The sum after calculation is " + total);
		
		
		scnr.close();
	}

}
