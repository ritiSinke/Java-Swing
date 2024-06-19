package alternative;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GradesTab extends JPanel{
	
	public GradesTab() {
		setLayout(new FlowLayout());
		JLabel grades=new JLabel("Enter Grades");
	     JTextArea gradesArea = new JTextArea(10, 30);
	        
	        JButton submitButton = new JButton("Submit");
	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String grades = gradesArea.getText();
	                JOptionPane.showMessageDialog(null, "Entered Grades:\n" + grades);
	            }
	        });
	        add(grades);
	        add(gradesArea);
	        add(submitButton);
	        

	}

}
