import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentManager = new AssignmentManager(input); 

		//				switch(menuNum) {
		//				case 1:
		//					assignmentManager.addAssignment();
		//					if(assignmentManager.ifContinue() == 1) { 
		//						continue;
		//					}
		//					else break; 
		//				
		//				case 2: 
		//					assignmentManager.submittedAssignment();
		//					if(assignmentManager.ifContinue() == 1) { 
		//						continue;
		//					}
		//					else break;
		//
		//				case 3:
		//					assignmentManager.editAssignment();
		//					
		//					if(assignmentManager.ifContinue() == 1) { 
		//						continue;
		//					}
		//					else break;	
		//					
		//				case 4:
		//					assignmentManager.viewAssignments();
		//					if(assignmentManager.ifContinue() == 1) { 
		//						continue;
		//					}
		//					else break;		
		//				}
		//				defualt:
		//					continue;

		selectMenu(input, assignmentManager);
	}

	public static void selectMenu(Scanner input, AssignmentManager assignmentManager) {
		int menuNum = 0;

		while(menuNum != 5) {
			try {
				System.out.println("");
				System.out.println("*** Assignment Management System Menu ***");
				System.out.println("1. Add Assignment");
				System.out.println("2. Submitted Assignment");
				System.out.println("3. Edit Assignment");
				System.out.println("4. View Assignments");
				System.out.println("5. Exit");
				System.out.print("Select one number between 1 - 5 : ");
				menuNum = input.nextInt();
				if(menuNum == 1) {
					assignmentManager.addAssignment();

					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;
				}


				else if(menuNum == 2) {
					assignmentManager.submittedAssignment();

					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;

				}

				else if(menuNum == 3) {
					assignmentManager.editAssignment();

					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;	
				}

				else if(menuNum == 4) {
					assignmentManager.viewAssignments();
					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;	
				}

				else break;				
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				menuNum = -1;
			}

		}
	}
}


