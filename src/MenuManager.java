	import java.util.Scanner;

	public class MenuManager {
		
		public static void main(String[] args) {
			int menuNum = 0;
			String [] assignInfo = {"no assignment","no assignment","no assignment","0"};
			double score = 0.0;
			Scanner input = new Scanner(System.in);
			AssignmentManager assignmentManager = new AssignmentManager(input); 
			Assignment assignment = new Assignment();
			
			while(menuNum != 5) {
				assignment.ViewMenu();
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
					assignment.printinfoEdit();
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
				
				else break;
				
			}
		}
	}


