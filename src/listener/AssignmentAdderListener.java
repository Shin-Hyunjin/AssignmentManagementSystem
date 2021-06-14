package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import assignment.AssignmentInput;
import assignment.AssignmentType;
import assignment.IndividualWork;
import exception.DateFormatException;
import manager.AssignmentManager;

public class AssignmentAdderListener implements ActionListener {
	JTextField fieldSub;
	JTextField fieldPfss;
	JTextField fieldName;
	JTextField fieldDeadline;
	AssignmentManager assignmentManager;

	public AssignmentAdderListener(JTextField fieldSub, JTextField fieldPfss, JTextField fieldName,
			JTextField fieldDeadline, AssignmentManager assignmentManager) {
		this.fieldSub = fieldSub;
		this.fieldPfss = fieldPfss;
		this.fieldName = fieldName;
		this.fieldDeadline = fieldDeadline;
		this.assignmentManager = assignmentManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		AssignmentInput assignment = new IndividualWork(AssignmentType.IndividualWork);
		try {
			assignment.setSubject(fieldSub.getName());
			assignment.setProfessor(fieldPfss.getName());
			assignment.setAssignName(fieldName.getName());
			assignment.setDeadline(fieldDeadline.getText());
			assignmentManager.addAssignment(assignment);
			putObject(assignmentManager, "assignmentmanager.ser");
			assignment.printInfoS();
		} catch (DateFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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