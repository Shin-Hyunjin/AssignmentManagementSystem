package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import assignment.AssignmentInput;
import manager.AssignmentManager;

public class AssignmentViewer extends JPanel {
	
	WindowFrame frame; 
	
	AssignmentManager assignmentManager;
	
	public AssignmentManager getAssignmentManager() {
		return assignmentManager;
	}

	public void setAssignmentManager(AssignmentManager assignmentManager) {
		this.assignmentManager = assignmentManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Professor");	
		model.addColumn("Assignment Name");
		model.addColumn("Deadline");
		
		for(int i=0; i<assignmentManager.size(); i++) {
			Vector row = new Vector();
			AssignmentInput ai = assignmentManager.get(i);
			row.add(ai.getSubject());
			row.add(ai.getProfessor());
			row.add(ai.getAssignName());
			row.add(ai.getDeadline());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public AssignmentViewer(WindowFrame frame, 	AssignmentManager assignmentManager) {	
		this.frame = frame; 
		this.assignmentManager = assignmentManager;
		
		System.out.println("***" + assignmentManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Professor");	
		model.addColumn("Assignment Name");
		model.addColumn("Deadline");
		
		for(int i=0; i<assignmentManager.size(); i++) {
			Vector row = new Vector();
			AssignmentInput ai = assignmentManager.get(i);
			row.add(ai.getSubject());
			row.add(ai.getProfessor());
			row.add(ai.getAssignName());
			row.add(ai.getDeadline());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
