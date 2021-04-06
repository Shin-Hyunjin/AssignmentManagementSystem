
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
}