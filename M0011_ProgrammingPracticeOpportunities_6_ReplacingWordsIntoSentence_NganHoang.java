package Extra_Credit;
import java.util.Scanner;
public class M0011_ProgrammingPracticeOpportunities_6_ReplacingWordsIntoSentence_NganHoang {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String color, food, animal, name, sentence;
		System.out.println("Please enter your favorite color ");
		color = scnr.nextLine();
		
		System.out.println("Please enter your favorite food ");
		food = scnr.nextLine();
		
		System.out.println("Please enter your favorite animal ");
		animal = scnr.nextLine();
		
		System.out.println("Please enter first name of your friend or relative ");
		name = scnr.nextLine();
		
		sentence = "I had a dream that Name ate a Color Animal and said it tasted like Food!";
		sentence = sentence.replace("Name", name);
		sentence = sentence.replace("Color", color);
		sentence = sentence.replace("Animal", animal);
		sentence = sentence.replace("Food", food);
		
		System.out.println(sentence);
		
		scnr.close();
		
		/***************** The End *****************/
	}

}
