import java.util.Scanner;

public class AssignmentManager {
	Assignment assignment;
	Scanner input;
	
	AssignmentManager(Scanner input) {
		this.input = input;
	}
	
	public String[] addInfoS() {
		assignment = new Assignment();
		String [] addInfoS = new String[4];
		
		System.out.println("");
		System.out.println("--- Add Assignments ---");
		System.out.print("Subject Name : ");
		assignment.subject = input.next();
		addInfoS[0]=assignment.subject;
		System.out.print("Professor Name : ");
		assignment.professor = input.next();
		addInfoS[1]=assignment.professor;
		System.out.print("Assignment Name : ");
		assignment.assignName = input.next();
		addInfoS[2]=assignment.assignName;
		System.out.print("Deadline : ");
		assignment.deadline = input.next();
		addInfoS[3]=assignment.deadline;
		assignment.assignInfo = addInfoS;

		return addInfoS;
	}


	public double addScore() {
		System.out.print("Assignment Score : ");
		assignment.score = input.nextDouble();
		
		return assignment.score;
	}

	public int ifContinue() {
		System.out.print("Continue? Input one number(YES : 1 / NO : 0): ");
		int answer = input.nextInt();	
		
		return answer;
	}

	public void submittedAssignments() {
		
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

	public String[] editInfoS(String [] InfoS) {
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

	public double editScore(double score) {
		System.out.print("Input Assignment Score : ");
		score = input.nextDouble();
		return score;
	}

	public void viewassignments(String[] assignInfoS, double assignScore) {
		
		System.out.println("");	
		System.out.println("--- View Assignments ---");
		System.out.println("Subject Name : " + assignInfoS[0]);
		System.out.println("Professor Name : " + assignInfoS[1]);
		System.out.println("Assignment Name : " + assignInfoS[2]);
		System.out.println("Submission Date : " + assignInfoS[3]);
		System.out.println("Assignment Score : " + assignScore);	
	}
}