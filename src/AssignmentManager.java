import java.util.ArrayList;
import java.util.Scanner;

import assignment.Assignment;
import assignment.AssignmentInput;
import assignment.AssignmentType;
import assignment.ExamSubstitutionTask;
import assignment.GroupProject;
import assignment.IndividualWork;

public class AssignmentManager {
	ArrayList<AssignmentInput> assignments = new ArrayList<AssignmentInput>();
	Scanner input;

	AssignmentManager(Scanner input) {
		this.input = input;
	}

	public void addAssignment() {
		int type = 0;
		AssignmentInput assignmentInput;
		while(type != 1 && type != 2) {
			System.out.println("");
			System.out.println("--- Add Assignments ---");
			System.out.println("1 for Individual Work.");
			System.out.println("2 for Group Project");
			System.out.println("3 for Exam Substitution Task");
			System.out.print("Select num 1, 2 or 3 for Assignment Type : ");
			type = input.nextInt();
			if(type == 1) {
				assignmentInput = new IndividualWork(AssignmentType.IndividualWork);
				assignmentInput.getUserInputInfoS(input);
				assignments.add(assignmentInput);
				break;
			}
			else if(type == 2) {
				assignmentInput = new GroupProject(AssignmentType.GroupProject);
				assignmentInput.getUserInputInfoS(input);
				assignments.add(assignmentInput);
				break;
			} 
			else if(type == 3) {
				assignmentInput = new ExamSubstitutionTask(AssignmentType.ExamSubstitutionTask);
				assignmentInput.getUserInputInfoS(input);
				assignments.add(assignmentInput);
				break;
			}
			else {
				System.out.print("Please, Select number for Assignment Type between 1 and 3 : ");
			}
		}
	}

	public int ifContinue() {
		System.out.print("Continue? Input one number(YES : 1 / NO : 0): ");
		int answer = input.nextInt();	

		return answer;
	}

	public void submittedAssignment() {

		System.out.println("");
		System.out.println("--- Submitted Assignments ---"); 
		System.out.print("Assignment Name : "); 
		String s_assignName = input.next(); 
		int index = -1;
		for(int i=0; i<assignments.size(); i++) {
			if(assignments.get(i).getAssignName().equals(s_assignName)) {
				index = i;
				break;
			}
		}
		
		
		
		if(index >= 0) {
			assignments.remove(index);
			System.out.println("the assignment " + s_assignName + " is submitted.");
		}
		else {
			System.out.println("the assignment has not been registered.");
			return;
		}
	}

	public void editAssignment() {
		System.out.println("Assignment Name : ");
		String assignName = input.next();
		for(int i=0; i<assignments.size(); i++) {
			AssignmentInput assignmentInput = assignments.get(i);
			if(assignments.get(i).getAssignName().equals(assignName)) {

				assignmentInput.printinfoEdit();
				int editNum = input.nextInt();

				if (editNum==1) {
					System.out.print("Input Subject Name : ");
					String subject = input.next(); 
					assignmentInput.setSubject(subject);
				}
				else if(editNum==2) {
					System.out.print("Input Professor Name : "); 
					String professor = input.next(); 
					assignmentInput.setProfessor(professor);
				}
				else if(editNum==3) {
					System.out.print("Input Assignment Name : "); 
					String assignmentName = input.next(); 
					assignmentInput.setAssignName(assignmentName);
				}
				else if(editNum==4) {
					System.out.print("Input Deadline : "); 
					String deadline = input.next();  
					assignmentInput.setDeadline(deadline);
				}
//				else if(editNum==5) {
//					System.out.print("Input Presentation Date : "); 
//					String date = input.next();  
//					assignment.setDate(date);
//				}
				else {
					System.out.print("Input Assignment Score : ");
					double score = input.nextDouble();
					assignmentInput.setScore(score);
				}
			}
		}
	}

	public void viewAssignments() {

		for(int i=0; i<assignments.size(); i++) {
			assignments.get(i).printInfoS();
			System.out.println("");
		}
	}
}