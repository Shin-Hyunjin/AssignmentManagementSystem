package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.AssignmentAdderCancelListener;
import listener.AssignmentAdderListener;
import manager.AssignmentManager;

public class AssignmentAdder extends JPanel {
	
	WindowFrame frame; 
	AssignmentManager assignmentManager;
	
	public AssignmentAdder(WindowFrame frame, AssignmentManager assignmentManager) {
		this.frame = frame; 
		this.assignmentManager = assignmentManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSub = new JLabel("Subject: ", JLabel.TRAILING);
		JTextField fieldSub = new JTextField(20);
		labelSub.setLabelFor(fieldSub);
		panel.add(labelSub);
		panel.add(fieldSub);
		
		JLabel labelPfss = new JLabel("Professor: ", JLabel.TRAILING);
		JTextField fieldPfss = new JTextField(20);
		labelPfss.setLabelFor(fieldPfss);
		panel.add(labelPfss);
		panel.add(fieldPfss);
		
		JLabel labelName = new JLabel("AssignmentName: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(20);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDeadline = new JLabel("Deadline: ", JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField(20);
		labelDeadline.setLabelFor(fieldDeadline);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AssignmentAdderListener(fieldSub, fieldPfss, fieldName, fieldDeadline, assignmentManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AssignmentAdderCancelListener(frame));
		
		panel.add(labelDeadline);
		panel.add(fieldDeadline);
		
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
