import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger =new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentManager = getObject("assignmentmanager.ser");		
		if(assignmentManager == null) {
			assignmentManager = new AssignmentManager(input); 
		}

		selectMenu(input, assignmentManager);
		putObject(assignmentManager, "assignmentmanager.ser");
	}

	public static void selectMenu(Scanner input, AssignmentManager assignmentManager) {
		int menuNum = 0;

		while(menuNum != 5) {
			try {
				showMenu(); 
				menuNum = input.nextInt();
				switch(menuNum) {
				case 1:
					assignmentManager.addAssignment();
					logger.log("add a assignment");
					break; 

				case 2: 
					assignmentManager.submittedAssignment();
					logger.log("delete a assignment");
					break;

				case 3:
					assignmentManager.editAssignment();
					logger.log("edit a assignment");
					break;	

				case 4:
					assignmentManager.viewAssignments();
					logger.log("view a list of assignment");
					break;		
					
				default:
					continue;
				}	
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
	
	public static void showMenu() {
		System.out.println("");
		System.out.println("*** Assignment Management System Menu ***");
		System.out.println("1. Add Assignment");
		System.out.println("2. Submitted Assignment");
		System.out.println("3. Edit Assignment");
		System.out.println("4. View Assignments");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
	
	public static AssignmentManager getObject(String filename) {
		AssignmentManager assignmentManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file); 
			
			assignmentManager = (AssignmentManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return assignmentManager;
	}
	
	public static void putObject(AssignmentManager assignmentManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			out.writeObject(assignmentManager);

			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


