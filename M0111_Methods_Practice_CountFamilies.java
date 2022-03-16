package Extra_Credit;
import java.util.Scanner;
public class M0111_Methods_Practice_CountFamilies {
	
public static void income_array (int numofFamilies) {
	Scanner keyboard = new Scanner (System.in);
	double [] income = new double [numofFamilies];
	double ten ;
	int count = 0;
	
	for (int i = 0; i< numofFamilies; i++) 
		income[i] = keyboard.nextDouble();	
	 
	 ten = max_income(income) * 0.1;
	 
	 for (int i=0; i<numofFamilies; i++ ) {
		if( income[i] < ten ) {
			count+= 1;
			System.out.print(income[i]+" ");
		}
	 }
		 System.out.println("\n"+ count+ " family(s)");
	 keyboard.close();
}
public static double max_income (double [] income_array) {
	double max = 0;
	
	for (int i = 0; i< income_array.length; i++) {
		if (income_array[i]> max)
			max = income_array[i];
	}	
	return max;
}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int k;
		
		
		System.out.println("Hello, this is 'Count Families' program.\n");
		System.out.println("How many families do you want to analyze?");
		k = keyboard.nextInt();
		System.out.println("Please enter the income of families under $150,000 separated by space!");
		
		income_array(k);
		
		
		
 		keyboard.close();
	}

}
