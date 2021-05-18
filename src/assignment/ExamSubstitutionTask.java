package assignment;

import java.util.Scanner;

public class ExamSubstitutionTask extends Assignment {
	
	public ExamSubstitutionTask(AssignmentType type) {	
		this.type = type;
	}
	
	public void getUserInputInfoS(Scanner input) {
		setAssignSubject(input);
		setAssginProfessor(input);
		setName(input);
		setAssignDeadline(input);
		setAssignScore(input);
		setAssignRatio(input);
	}
	
	public void printInfoS() {
		String stype = getTypeString();
		System.out.println("AssignmentType : " + stype);
		System.out.println("Subject Name : " + this.subject);
		System.out.println("Professor Name : " + this.professor);
		System.out.println("Assignment Name : " + this.assignName);
		System.out.println("Deadline : " + this.deadline);
     	System.out.println("Rate of reflection of Grades : " + this.ratio);
		System.out.println("Assignment Score : " + this.score);	
	}	
}
	

