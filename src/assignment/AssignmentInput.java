package assignment;

import java.util.Scanner;

import exception.DateFormatException;

public interface AssignmentInput {

	public String getAssignName();
	
	public void setSubject(String subject);
	
	public void setProfessor(String professor);
	
	public void setAssignName(String assignName);
	
	public void setDeadline(String deadline) throws DateFormatException;
	
	public void setScore(double score);
	
	public void getUserInputInfoS(Scanner input);
	
	public void printinfoEdit();
	
	public void printInfoS();
	
	public void setAssignSubject(Scanner input);
	
	public void setAssginProfessor(Scanner input);
	
	public void setName(Scanner input);
	
	public void setAssignDeadline(Scanner input);
	
	public void setAssignScore(Scanner input); 
}
