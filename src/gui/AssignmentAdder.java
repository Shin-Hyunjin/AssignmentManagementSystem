package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AssignmentAdder extends JFrame {
	
	public AssignmentAdder() {
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
		panel.add(labelDeadline);
		panel.add(fieldDeadline);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
