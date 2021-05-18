package assignment;

import java.util.Scanner;

import exception.DateFormatException;

public class GroupProject extends Assignment {
	
	public GroupProject(AssignmentType type) {	
		this.type = type;
	}

	public void getUserInputInfoS(Scanner input) {
		setAssignSubject(input);
		setAssginProfessor(input);
		setName(input);
		setAssignDeadline(input);
		setPresentataionwithYN(input);
		setAssignScore(input);
	}

	public void setPresentataionwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.print("Is there a presentation? (Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					setAssignPresentation(input);
					break;
				}
				else if(answer == 'N' || answer == 'n') {
					this.setDate("");
					break;
				}
				else {
				}
			} catch(DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the date that contains '-'.");
			}
		}
	}

		public void printInfoS() {
			String stype = getTypeString();
			System.out.println("AssignmentType : " + stype);
			System.out.println("Subject Name : " + this.subject);
			System.out.println("Professor Name : " + this.professor);
			System.out.println("Assignment Name : " + this.assignName);
			System.out.println("Deadline : " + this.deadline);
			System.out.println("Presentation Date : " + this.date);
			System.out.println("Assignment Score : " + this.score);	
		}
}

