package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AssignmentAdder;
import gui.AssignmentViewer;
import gui.WindowFrame;

public class AssignmentAdderCancelListener implements ActionListener {
	
	WindowFrame frame; 

	public AssignmentAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	
	}

}
