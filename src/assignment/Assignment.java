package assignment;

import java.io.Serializable;
import java.util.Scanner;

import exception.DateFormatException;

public abstract class Assignment implements AssignmentInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2029335262320866124L;
	
	protected AssignmentType type = AssignmentType.IndividualWork;
	protected String subject;
	protected String professor;
	protected String assignName;
	protected String deadline;
	protected double score;
	protected String date;
	protected double ratio;
	
	public Assignment() {	
	}
	
	public Assignment(AssignmentType type) {	
		this.type = type;
	}

	public Assignment(double score) {
		this.score = score;
	}

	public Assignment(String subject,String assignName) {
		this.subject = subject;
		this.assignName = assignName;
	}

	public Assignment(AssignmentType type,String subject,String professor,String assignName,String deadline, double score) {
		this.type = type;
		this.subject = subject;
		this.professor = professor;
		this.assignName = assignName;
		this.deadline = deadline;	
		this.score = score;
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

	public void setDeadline(String deadline) throws DateFormatException {
		if(!deadline.contains(".") && deadline.contentEquals("")) {
			throw new DateFormatException();
		}
		this.deadline = deadline;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) throws DateFormatException {
		if(!deadline.contains(".") && deadline.contentEquals("")) {
			throw new DateFormatException();
		}
		this.date = date;
	}

	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
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

	public abstract void printInfoS();
	
	public void setAssignSubject(Scanner input) {
		System.out.print("Input Subject Name : ");
		String subject = input.next(); 
		this.setSubject(subject);
	}
	
	public void setAssginProfessor(Scanner input) {
		System.out.print("Input Professor Name : "); 
		String professor = input.next(); 
		this.setProfessor(professor);
	}
	
	public void setName(Scanner input) {
		System.out.print("Input Assignment Name : "); 
		String assignmentName = input.next(); 
		this.setAssignName(assignmentName);
	}
	
	public void setAssignDeadline(Scanner input) {
		String deadline ="";
		while (!deadline.contains(".")) {
			System.out.print("Input Deadline : "); 
			deadline = input.next();  
			try {
				this.setDeadline(deadline);
			} catch(DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the date that contains '.'.");
			}	
		}
	}
	
	public void setAssignScore(Scanner input) {
		System.out.print("Input Assignment Score : ");
		double score = input.nextDouble();
		this.setScore(score);
	}
	
	public void setAssignPresentation(Scanner input) {
		String date = "";
		while (!date.contains(".")) {
			System.out.print("Input Presentation Date : "); 
			date = input.next();  
			try {
				this.setDate(date);
			} catch(DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the date that contains '.'.");
			}	
		}	
	}
	
	public void setAssignRatio(Scanner input) {	
		System.out.println("Rate of reflection of Grades : ");
		double ratio = input.nextDouble();
		this.setRatio(ratio);
	}
	
	public String getTypeString() {
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
		return stype;
	}
}//
