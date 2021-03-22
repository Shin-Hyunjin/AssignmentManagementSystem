import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String subject = "no assignment";
		String professor = "no assignment";
		String assignName = "no assignment";
		int deadline = 0;
		double score = 0.0;
		int menuNum = 5;
		int answer;
	   
		while(menuNum != 6) {
		    	System.out.println("*** Assignment Management System Menu ***");
		    	System.out.println("1. Add Assignments");
				System.out.println("2. Submitted Assignments");
				System.out.println("3. Edit Assignments");
				System.out.println("4. View Assignments");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.print("Select one number between 1 - 6 : ");
			    menuNum = input.nextInt();
		    
				if(menuNum == 1) {
					System.out.println("--- Add Assignments ---");
					System.out.println("Subject Name");
					subject = input.next();
					System.out.println("Professor Name");
					professor = input.next();
					System.out.println("Assignment Name");
					assignName = input.next();
					System.out.println("Deadline");
					deadline = input.nextInt();
					System.out.println("Assignment Score");
					score = input.nextDouble(); 
					
					System.out.println("Continue? Input one number(YES : 1 / NO : 0): ");
					answer = input.nextInt();
					if(answer == 1) { 
						continue;
					}
					else break;
					}
			
				
				else if(menuNum == 2) {
					System.out.println("--- Submitted Assignments ---");
					System.out.println("Subject Name");
					String s_subject = input.next();
					System.out.println("Professor Name");
					String s_professor = input.next();
					System.out.println("Assignment Name");
					String s_assignName = input.next();
					System.out.println("Submission Date");
					int submissionDate = input.nextInt();
					System.out.println("Assignment Score");
					double s_score = input.nextDouble(); 
					
					System.out.println("Continue? Input one number(YES : 1 / NO : 0): ");
					answer = input.nextInt();
					if(answer == 1) { 
						continue;
					}
					else break;
				}
				
				else if(menuNum == 3) {
					System.out.println("--- Edit Assignments ---");
					System.out.println("--- What kind of information do you want to edit? ---");
					System.out.println("Select one number between 1 - 5");
					System.out.println("1. Edit Subject Name");
					System.out.println("2. Edit Professor Name");
					System.out.println("3. Edit Assignment Name");
					System.out.println("4. Edit Deadline");
					System.out.println("5. Edit Assignment Score");
					int editNum = input.nextInt();
						
					switch(editNum) {
					case 1: System.out.println("Input Subject Name");
					        subject = input.next(); break;	
					case 2: System.out.println("Input Professor Name"); 
					        professor = input.next(); break;
					case 3: System.out.println("Input Assignment Name"); 
			                assignName = input.next(); break;
					case 4: System.out.println("Input Deadline"); 
					        deadline = input.nextInt(); break;
					case 5: System.out.println("Input Assignment Score");
					        score = input.nextDouble(); break;
					        }
					
					System.out.println("Continue? Input one number(YES : 1 / NO : 0): ");
					answer = input.nextInt();
					if(answer == 1) { 
						continue;
					}
					else break;
				}
				
			    else if(menuNum == 4) {
			    	System.out.println("--- View Assignments ---");
					System.out.println("Subject Name : " + subject);
					System.out.println("Professor Name : " + professor);
					System.out.println("Assignment Name : " + assignName);
					System.out.println("Submission Date : " + deadline);
					System.out.println("Assignment Score : " + score);
					
					System.out.println("Continue? Input one number(YES : 1 / NO : 0): ");
					answer = input.nextInt();
					if(answer == 1) { 
						continue;
					}
					else break;
			    }
				
			    else;			
		}   
	}
}