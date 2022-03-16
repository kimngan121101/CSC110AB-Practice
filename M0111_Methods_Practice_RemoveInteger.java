package Extra_Credit;
import java.util.Scanner;
public class M0111_Methods_Practice_RemoveInteger {
	
	public static int [] remove (int v, int [] input) {
		int count = 0;
	
		for (int i = 0; i< 7; i++) {
		if (input[i] == v)
			++count;
		}
	
		int [] new_array = new int [7 - count];
		int i = 0;
		int j = 0;
	
		while (j< new_array.length ) {
			if (input[i] != v) {
			new_array [j] = input [i];
			++j;
			++i;
			}
			else 
			++i;
		}
		return new_array;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int [] num = new int [7];
		int remove_num;
		
		System.out.println("Please enter 7 integers seperated by space!");
		for (int i= 0; i <7; i++)
			num[i] = scnr.nextInt();
		
		System.out.println("What number do you want to remove ?");
		remove_num = scnr.nextInt();
		
		for (int i= 0 ; i< remove(remove_num, num).length; i++)
		 System.out.print(remove(remove_num, num)[i]+ " ");
		
		scnr.close();
	}

}
