package assignment;

import java.util.Scanner;

public class GroupProject extends Assignment {
	
	protected String date="x";
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public GroupProject(AssignmentType type) {	
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
		
		char answer = 'x';
		while(answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.print("Is there a presentation? (Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("Presentation Date : ");
				String date = input.next();
				this.setDate(date);
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setDate("");
				break;
			}
			else {			
			}
		}
			
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
     	System.out.println("Presentation Date : " + this.date);
		System.out.println("Assignment Score : " + this.score);	
	}
	
}
