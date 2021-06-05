package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AssignmentManager;

public class WindowFrame extends JFrame {
	
	AssignmentManager assignmentManager;
	
	MenuSelection menuSelection;
	AssignmentAdder assignmentAdder;
	AssignmentViewer assignmentViewer;

	public WindowFrame(	AssignmentManager assignmentManager) {
		this.assignmentManager = assignmentManager;
		this.menuSelection = new MenuSelection(this);
		this.assignmentAdder = new AssignmentAdder(this);
		this.assignmentViewer = new AssignmentViewer(this, this.assignmentManager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public AssignmentAdder getAssignmentAdder() {
		return assignmentAdder;
	}

	public void setAssignmentAdder(AssignmentAdder assignmentAdder) {
		this.assignmentAdder = assignmentAdder;
	}

	public AssignmentViewer getAssignmentViewer() {
		return assignmentViewer;
	}

	public void setAssignmentViewer(AssignmentViewer assignmentViewer) {
		this.assignmentViewer = assignmentViewer;
	}

}
