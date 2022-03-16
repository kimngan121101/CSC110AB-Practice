package Extra_Credit;
import java.util.Scanner;
public class M0111_Methods_Practice_StrictlyIncreasing {
public static boolean isStrictlyIncreasing ( double [] input) {
	 double num = input[0]; 
	 boolean value = true;
	 
	for (int i = 1; i < 5; i++) {
		  if (input[i] > num) 
			  num = input[i];
		  else 
			  value = false;
	  }
	 return value;
}
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		double [] int_array = new double [5];
		
		System.out.println("Please enter 5 numbers seperated by space!");
		for (int i = 0; i<5; i++)
			int_array[i] = scnr.nextDouble();
		
		System.out.println(isStrictlyIncreasing(int_array));
		
		scnr.close();
	}

}
