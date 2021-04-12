package assignment;
import java.util.Scanner;

public class Assignment {
	protected AssignmentType type = AssignmentType.IndividualWork;
	protected String subject;
	protected String professor;
	protected String assignName;
	protected String deadline;
	protected String date="x";
	protected double score;

	public Assignment() {	
	}

	public Assignment(double score) {
		this.score = score;
	}

	public Assignment(String subject,String assignName) {
		this.subject = subject;
		this.assignName = assignName;
	}

	public Assignment(String subject,String professor,String assignName,String deadline, double score) {
		this.subject = subject;
		this.professor = professor;
		this.assignName = assignName;
		this.deadline = deadline;	
		this.score = score;
	}

	public AssignmentType getType() {
		return type;
	}

	public void setType(AssignmentType type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAssignName() {
		return assignName;
	}

	public void setAssignName(String assignName) {
		this.assignName = assignName;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}


	public void printinfoEdit(){
		System.out.println("");
		System.out.println("--- Edit Assignments ---");
		System.out.println("--- What kind of information do you want to edit? ---");
		System.out.println("1. Edit Subject Name");
		System.out.println("2. Edit Professor Name");
		System.out.println("3. Edit Assignment Name");
		System.out.println("4. Edit Deadline");
		System.out.println("5. Edit Presentation Date");
		System.out.println("6. Edit Assignment Score");
		System.out.print("Select one number between 1 - 6 : ");
	}

	public void printInfoS() {
		System.out.println("Subject Name : " + this.subject);
		System.out.println("Professor Name : " + this.professor);
		System.out.println("Assignment Name : " + this.assignName);
		System.out.println("Deadline : " + this.deadline);
		System.out.println("Presentation Date : " + this.date);
		System.out.println("Assignment Score : " + this.score);	
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
		
		System.out.print("Assignment Score : ");
		double score = input.nextDouble();
		this.setScore(score);
	}
	
}
