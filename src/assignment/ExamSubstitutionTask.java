package assignment;

import java.util.Scanner;

public class ExamSubstitutionTask extends Assignment {
	
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
        	
		System.out.print("Assignment Score : ");
		double score = input.nextDouble();
		this.setScore(score);
	}
	

}
