package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import assignment.Assignment;
import assignment.AssignmentInput;
import assignment.AssignmentType;
import assignment.ExamSubstitutionTask;
import assignment.GroupProject;
import assignment.IndividualWork;

public class AssignmentManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8282552683179764935L;
	
	ArrayList<AssignmentInput> assignments = new ArrayList<AssignmentInput>();
	transient Scanner input;
	AssignmentManager(Scanner input) {
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}

	public void addAssignment() {
		int type = 0;
		AssignmentInput assignmentInput;
		while(type < 1 || type > 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				type = -1;
			}
		}
	}

	public void submittedAssignment() {
		System.out.println("");
		System.out.println("--- Submitted Assignments ---"); 
		System.out.print("Assignment Name : "); 
		String s_assignName = input.next(); 
        int index = findIndex(s_assignName);
		
		removefromAssignments(index, s_assignName);
	}
	public int findIndex(String s_assignName) {
		int index = -1;
		for(int i=0; i<assignments.size(); i++) {
			if(assignments.get(i).getAssignName().equals(s_assignName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromAssignments(int index, String s_assignName) {
		if(index >= 0) {
			assignments.remove(index);
			System.out.println("the assignment " + s_assignName + " is submitted.");
			return 1;
		}
		else {
			System.out.println("the assignment has not been registered.");
			return -1;
		}	
	}

	public void editAssignment() {
		System.out.println("Assignment Name : ");
		String assignName = input.next();
		for(int i=0; i<assignments.size(); i++) {
			AssignmentInput assignment = assignments.get(i);
			if(assignments.get(i).getAssignName().equals(assignName)) {

				assignment.printinfoEdit();
				int editNum = input.nextInt();
				switch(editNum) {
				case 1: 					
					assignment.setAssignSubject(input); 
					break;
				case 2:
					assignment.setAssginProfessor(input); 
					break;
				case 3:
					assignment.setName(input);
					break;
				case 4:
					assignment.setAssignDeadline(input);
					break;
				case 5:
					assignment.setAssignScore(input);
					break;
				default:	
					continue;
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
	
	public int size() {
		return assignments.size();
	}
	
	public AssignmentInput get(int index) {
		return (Assignment) assignments.get(index);
	}
}