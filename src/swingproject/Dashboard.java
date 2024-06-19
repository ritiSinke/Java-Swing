package swingproject;

import javax.swing.*;

import swingproject.*;


public class Dashboard {
	
	public Dashboard() {

	JFrame j=new JFrame("Library Management System");
	j.setSize(500,500);
	
	JTabbedPane jtp1=new JTabbedPane();
	
	jtp1.addTab("Add Student",new AddStudent());
	jtp1.addTab("Add Book", new AddBook());
	jtp1.addTab("Issue Book", new IssueBook());
	jtp1.addTab("Display Record",new DisplayRecord());
	

	j.add(jtp1);
	
	j.setVisible(true);
	
	
}
	public static void main(String[] args) {
		new Dashboard();
	}
}