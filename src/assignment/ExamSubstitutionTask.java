package assignment;

import java.util.Scanner;

public class ExamSubstitutionTask extends Assignment implements AssignmentInput {
	
	protected double ratio;
	
	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public ExamSubstitutionTask(AssignmentType type) {	
		this.type = type;
	}
	
	public void getUserInputInfoS(Scanner input) {
		System.out.print("Subject Name : ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("Professor Name : ");
		String professor = input.next();
		this.setProfessor(professor);
		
		System.out.print("Assignment Name : ");
		String assignName = input.next();
		this.setAssignName(assignName);
		
		System.out.print("Deadline : ");
		String deadline = input.next();
		this.setDeadline(deadline);
		
		System.out.println("Rate of reflection of Grades : ");
		double ratio = input.nextDouble();
        this.setRatio(ratio);
		
		System.out.print("Assignment Score : ");
		double score = input.nextDouble();
		this.setScore(score);
	}
	
	public void printInfoS() {
		String stype = "none";
		switch(this.type) {
		case IndividualWork:
			stype = "Individual";
			break;
		case GroupProject:
			stype = "Group";
			break;
		case ExamSubstitutionTask:
		    stype = "Exam";
			break;
		default:
		}
		System.out.println("AssignmentType : " + stype);
		System.out.println("Subject Name : " + this.subject);
		System.out.println("Professor Name : " + this.professor);
		System.out.println("Assignment Name : " + this.assignName);
		System.out.println("Deadline : " + this.deadline);
     	System.out.println("Rate of reflection of Grades : " + this.ratio);
		System.out.println("Assignment Score : " + this.score);	
	}	
}
	

