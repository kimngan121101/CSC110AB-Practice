package Extra_Credit;
import java.util.Scanner;
public class DanceLesson {

	public static void main(String[] args) {
		  Scanner keyboard = new Scanner(System.in); 
		  
		  System.out.println("Enter number of male dancers:");  
		  int men = keyboard.nextInt(); 
		  
		  System.out.println("Enter number of female dancers:");  
		  int women = keyboard.nextInt();  
		  
		  try {
		  if (men == 0 && women == 0) 
			  throw new Exception("No students."); 
		  else if (men == 0)   
			  throw new Exception("No men."); 
		  else if (women == 0)  
			  throw new Exception("No women."); 
			  
		  
		  // women >= 0 && men >= 0   
		  if (women >= men)      
			  System.out.println("Each man must dance with " + women/(double)men + " women."); 
		  else      
			  System.out.println("Each woman must dance with " + men/(double)women + " men.");   
		  System.out.println("Begin the lesson.");    
		  }
		  catch (Exception e) {
			  System.out.print(e.getMessage());
			  System.out.println(" Lesson is canceled.");
			  
		  }
	}

}
