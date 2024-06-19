package swingproject;

import java.awt.GridLayout;

import javax.swing.*;

public class AddBook  extends JPanel{
	JTextField authorName;
	JTextField title;
	JTextField publicationName;
	JTextField subject;
	
	public AddBook() {
		setLayout(new GridLayout(5,2));
		
		JLabel aname=new JLabel("Author Name:");
		authorName=new JTextField();
		
		JLabel t=new JLabel("Title:");
		title=new JTextField();
		
		JLabel pub=new JLabel("Publication name:");
		publicationName=new JTextField();
		
		JLabel s=new JLabel("Subject:");
		subject=new JTextField();
		
		JButton addbook=new JButton("Add Book");
		
		add(aname);
		add(authorName);
		add(t);
		add(title);
		add(pub);
		add(publicationName);
		add(s);
		add(subject);
		add(addbook);
	}
	
}
