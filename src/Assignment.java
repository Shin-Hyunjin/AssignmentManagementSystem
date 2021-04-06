import java.util.Scanner;

public class Assignment {
		String subject = "no assignment";
		String professor = "no assignment";
		String assignName = "no assignment";
		String deadline = "0";
		double score = 0.0;
		String[] assignInfo = {"no assignment","no assignment","no assignment","0"};
		
		public Assignment() {	
		}
		
		public Assignment(double score) {
			this.score = score;
		}
		
		public Assignment(String subject,String assignName) {
			this.subject = subject;
			this.assignName = assignName;
		}
		
		public Assignment(String subject,String professor,String assignName,String deadline) {
			this.subject = subject;
			this.professor = professor;
			this.assignName = assignName;
			this.deadline = deadline;	
		}
			
		public void ViewMenu() {
			System.out.println("");
			System.out.println("*** Assignment Management System Menu ***");
			System.out.println("1. Add Assignments");
			System.out.println("2. Submitted Assignments");
			System.out.println("3. Edit Assignments");
			System.out.println("4. View Assignments");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
			}
		
		public void printinfoEdit(){
			System.out.println("");
			System.out.println("--- Edit Assignments ---");
			System.out.println("--- What kind of information do you want to edit? ---");
			System.out.println("1. Edit Subject Name");
			System.out.println("2. Edit Professor Name");
			System.out.println("3. Edit Assignment Name");
			System.out.println("4. Edit Deadline");
			System.out.println("5. Edit Assignment Score");
			System.out.print("Select one number between 1 - 5 : ");
		}
}