package Extra_Credit;
import java.util.Scanner;
public class M0101_CH5Loops_While_Loops {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x, y, z, k;
		long mean;
		double root; 
		boolean user_value_Input_notequalto_negative_one = true;
		
 
		while (user_value_Input_notequalto_negative_one) {
			System.out.println("Enter x ");
			x = scnr.nextInt();
			System.out.println("Enter y ");
			y = scnr.nextInt();
			System.out.println("Enter z ");
			z = scnr.nextInt();
			System.out.println("Enter the root ");
			k = scnr.nextInt();
			
			if (x!= -1 && y!= -1 && z != -1 && k != -1 ) {
		
			mean = x * y * z;
			
			root = Math.pow(mean, 1.0/k) ;
			
			System.out.println("The geometric mean is : "+ root);
			}		
			else 
				user_value_Input_notequalto_negative_one = false;
		}
		
		scnr.close();
			
	}

}
