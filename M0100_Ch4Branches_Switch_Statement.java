package Extra_Credit;
import java.util.Scanner;
public class M0100_Ch4Branches_Switch_Statement {

	public static void main(String[] args) {
		/********** Switch statement ************/
		
		Scanner scnr = new Scanner (System.in);
		System.out.println("Enter your grade as a letter :  ");
		char userGrade = scnr.nextLine().charAt(0);
		
		switch (userGrade){
		case 'A':
			System.out.println("4.0");
			break;
		case 'B':
			System.out.println("3.0");
			break;
		case 'C':
			System.out.println("2.0");
			break;
		case 'D':
			System.out.println("1.0");
			break;
		case 'F':
			System.out.println("0.0");
			break;
		default:
			System.out.println("0.0 error message");
			break;
		}
		System.out.println("");
		
		/******************Nested Switch Statement *******************/
		
		System.out.println("Please enter specific grade as letter with sign : ");
		String userInput = scnr.nextLine();
		char sign = userInput.charAt(1);
		char char1 = userInput.charAt(0);
		
		switch (char1){
		case 'A':{
			if (sign == '+')
				System.out.println("4.25");
			else if (sign == '-')
				System.out.println("3.75");
			else 
				System.out.println("4.0");
			break;}
		case 'B':{
			System.out.println("3.0");
			if (sign == '+')
				System.out.println("3.25");
			else 
				System.out.println("2.75");
			break;}
		case 'C':{
			System.out.println("2.0");
			if (sign == '+')
				System.out.println("2.25");
			else 
				System.out.println("1.75");
			break;}
		case 'D':{
			System.out.println("1.0");
			if (sign == '+')
				System.out.println("1.25");
			else 
				System.out.println("0.75");
			break;}
		case 'F':
			System.out.println("0.0");
			break;
		default:
			System.out.println("0.0 error message");
			break;
		}
		scnr.close();
	}

}
