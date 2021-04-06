	import java.util.Scanner;

	public class MenuManager {
		
		public static void main(String[] args) {
			int menuNum = 5;
			String [] assignInfo = {"no assignment","no assignment","no assignment","0"};
			double score = 0.0;
			Scanner input = new Scanner(System.in);
			AssignmentManager assignmentManager = new AssignmentManager(input); 
					
			while(menuNum != 6) {
				System.out.println("");
				System.out.println("*** Assignment Management System Menu ***");
				System.out.println("1. Add Assignments");
				System.out.println("2. Submitted Assignments");
				System.out.println("3. Edit Assignments");
				System.out.println("4. View Assignments");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.print("Select one number between 1 - 6 : ");
				menuNum = input.nextInt();
	            
				if(menuNum == 1) {
					assignInfo = assignmentManager.addInfoS(); 
					score = assignmentManager.addScore();
					
					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;
				}


				else if(menuNum == 2) {
					assignmentManager.submittedAssignments();
					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;
					
					
				}

				else if(menuNum == 3) {
					System.out.println("");
					System.out.println("--- Edit Assignments ---");
					System.out.println("--- What kind of information do you want to edit? ---");
					System.out.println("1. Edit Subject Name");
					System.out.println("2. Edit Professor Name");
					System.out.println("3. Edit Assignment Name");
					System.out.println("4. Edit Deadline");
					System.out.println("5. Edit Assignment Score");
					System.out.print("Select one number between 1 - 5 : ");
					int editNum = input.nextInt();

					if(editNum != 5) {
						assignInfo = assignmentManager.editInfoS(assignInfo);
					} 
					else score = assignmentManager.editScore(score); 

					
					
					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;
					
					
				}

				else if(menuNum == 4) {
					assignmentManager.viewassignments(assignInfo, score);
					if(assignmentManager.ifContinue() == 1) { 
						continue;
					}
					else break;	
					
				}
				else; 
			}
		}   
	}

