import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
	    String [] assignInfo = {"no assignment","no assignment","no assignment","0"};
		double score = 0.0;
		int menuNum = 5;
		int answer;
		Scanner input = new Scanner(System.in);
		
		// test   ///test
		
		
		
		while(menuNum != 6) {
			System.out.println("");
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
				assignInfo = addInfoS(); 
				score = addScore();
				
				if(ifContinue() == 1) { 
					continue;
				}
				else break;
			}


			else if(menuNum == 2) {
				submittedAssignments();
				if(ifContinue() == 1) { 
					continue;
				}
				else break;
				
				
			}

			else if(menuNum == 3) {
				System.out.println("");
				System.out.println("--- Edit Assignments ---");
				System.out.println("--- What kind of information do you want to edit? ---");
				System.out.println("1. Edit Subject Name");
				System.out.println("2. Edit Professor Name");
				System.out.println("3. Edit Assignment Name");
				System.out.println("4. Edit Deadline");
				System.out.println("5. Edit Assignment Score");
				System.out.print("Select one number between 1 - 5 : ");
				int editNum = input.nextInt();

				if(editNum != 5) {
					assignInfo = editInfoS(assignInfo);
				} 
				else score = editScore(score); 

				
				
				if(ifContinue() == 1) { 
					continue;
				}
				else break;
				
				
			}

			else if(menuNum == 4) {
				viewassignments(assignInfo, score);
				if(ifContinue() == 1) { 
					continue;
				}
				else break;	
				
			}
			else; 
		}
	}   

public static String[] addInfoS() {
	String [] addInfoS = new String[4];
	Scanner input = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("--- Add Assignments ---");
	System.out.print("Subject Name : ");
	String subject = input.next();
	addInfoS[0]=subject;
	System.out.print("Professor Name : ");
	String professor = input.next();
	addInfoS[1]=professor;
	System.out.print("Assignment Name : ");
	String assignName = input.next();
	addInfoS[2]=assignName;
	System.out.print("Deadline : ");
	String deadline = input.next();
	addInfoS[3]=deadline;

	return addInfoS;
}


public static double addScore() {
	Scanner input = new Scanner(System.in);
	System.out.print("Assignment Score : ");
	double score = input.nextDouble();
	
	return score;
}

public static int ifContinue() {
	Scanner input = new Scanner(System.in);
	System.out.print("Continue? Input one number(YES : 1 / NO : 0): ");
	int answer = input.nextInt();	
	
	return answer;
}

public static void submittedAssignments() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("--- Submitted Assignments ---"); 
	System.out.print("Subject Name : "); 
	String s_subject = input.next(); 
	System.out.print("Professor Name : "); 
	String s_professor = input.next(); 
	System.out.print("Assignment Name : "); 
	String s_assignName = input.next(); 
	System.out.print("Submission Date : "); 
	int submissionDate = input.nextInt(); 
	System.out.print("Assignment Score : "); 
	double s_score = input.nextDouble();  
}

public static String[] editInfoS(String [] InfoS) {
	Scanner input = new Scanner(System.in);
	String [] editInfoS = new String[4];
    editInfoS = InfoS;
    
	System.out.print("Please enter the number one more time. ");
    int editNum = input.nextInt();
    
	if (editNum==1) {
		System.out.print("Input Subject Name : ");
		editInfoS[0] = input.next(); 
	}
	else if(editNum==2) {
		System.out.print("Input Professor Name : "); 
		editInfoS[1] = input.next(); 
	}
	else if(editNum==3) {
		System.out.print("Input Assignment Name : "); 
		editInfoS[2] = input.next(); 
	}
	else {
		System.out.print("Input Deadline : "); 
		editInfoS[3] = input.next();  
	}
	return editInfoS;
}

public static double editScore(double score) {
	Scanner input = new Scanner(System.in);
    double editScore = addScore();
	System.out.print("Input Assignment Score : ");
	score = input.nextDouble();
	return score;
}

public static void viewassignments(String[] assignInfoS, double assignScore) {
	
	System.out.println("");	
	System.out.println("--- View Assignments ---");
	System.out.println("Subject Name : " + assignInfoS[0]);
	System.out.println("Professor Name : " + assignInfoS[1]);
	System.out.println("Assignment Name : " + assignInfoS[2]);
	System.out.println("Submission Date : " + assignInfoS[3]);
	System.out.println("Assignment Score : " + assignScore);	
}
}