package Extra_Credit;
import java.util.Scanner;

public class M0010_ProgrammingwithStrings_NganHoang {

	public static void main(String[] args) {
		        // First requirement (Practice String methods)
		
				String stringVariable = "Hello Hello";
				int  num ;
				char ch ;
				
				num = stringVariable.indexOf('e');
				ch = stringVariable.charAt(4);
				
				System.out.println(stringVariable);
				System.out.println(num);
				System.out.println(ch);
				
				System.out.println();
				
		        /***************************************/
				
				// Second requirement (My Word!)
				
				String mySentence ;
				
				mySentence = "   How are you?   ";
				
				mySentence = mySentence.trim();
				
				System.out.println("The original sentence is "+ mySentence);
				
				mySentence = mySentence.substring(0, mySentence.indexOf(' '));
				
				System.out.println("The first word of the sentence is "+ mySentence);
				
				System.out.println();
				
				
		        /***************************************/
				
				// Third requirement (Replace a word!)
				
				String sentence = "Word Processing is useless!";
				String input, newSentence;
			
				
			
				Scanner scnr = new Scanner(System.in);
				System.out.println("Please enter a word : ");
				input = scnr.nextLine();
				
				
				// newSentence = sentence.replace("useless", input);
				
				newSentence = sentence.replace(sentence.substring(sentence.indexOf(' ',17)+1,sentence.length()-1), input);
				
				System.out.println(newSentence);
				
				scnr.close();
				
				/*************** The End ***************/
				
	}

}
