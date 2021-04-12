package assignment;

import java.util.Scanner;

public class GroupProject extends Assignment {
	
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
	
}
