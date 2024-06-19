package alternative;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StudentInformationTab  extends JPanel{
	
	public StudentInformationTab() {
		 setLayout(new GridLayout(3,2));

	 JLabel name= new JLabel("Name");
	 JTextField txtname=new JTextField();
	 
	 JLabel age=new JLabel("Age");
	 JTextField txtage=new JTextField();
	 
	 JButton saveButton=new JButton("Save");
	 
	 saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String names = txtname.getText();
             String ages = txtage.getText();
             JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age);
         }
     });
	 
	 add(name);
	 add(txtname);
	 add(age);
	 add(txtage);
	 add(saveButton);

	}	 

}
