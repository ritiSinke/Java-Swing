package swingproject;

import java.awt.GridLayout;

import javax.swing.*;

public class IssueBook  extends JPanel{

	JTextField studentName;
	JTextField bookIssued;
	JTextField issuedDate;
	JTextField dueDate;
	
	public IssueBook() {
		GridLayout gll =new GridLayout(5,2);
		setLayout(gll);
		
		JLabel sname=new JLabel("Student Name:");
		studentName=new JTextField();
		
		JLabel bookissue=new JLabel("Book Issued:");
		bookIssued=new JTextField();
		
		JLabel ddate=new JLabel("Due Date:");
		dueDate=new JTextField();
		
		JButton issuebook=new JButton(" Issue Book");
		
		add(sname);
		add(studentName);
		add(bookissue);
		add(bookIssued);
		add(ddate);
		add(dueDate);
		add(issuebook);
	}
}
