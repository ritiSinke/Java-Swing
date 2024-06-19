package alternative;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Question2JDBC  implements ActionListener{
	
	JTextField firstName;
	JTextField lastName;
	JTextField email;
	JTextField phone;
	
	String url="jdbc:mysql://localhost:3306/Question2";
	String username="root";
	String password="root";

	public Question2JDBC() {
		JFrame jf=new JFrame("Insert Operation");
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(5,2));
		
		JLabel first=new JLabel("First Name");
		firstName=new JTextField();
		
		JLabel last=new JLabel("Last Name");
		lastName=new JTextField();
		
		JLabel eaddress=new JLabel("Email ");
		email=new JTextField();
		
		JLabel phoneNumber=new JLabel("Phone");
		phone=new JTextField();
		
	
		JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
	

		    jf.add(first);
		    jf.add(firstName);
		    jf.add(last);
		    jf.add(lastName);
		    jf.add(eaddress);
		    jf.add(email);
		    jf.add(phoneNumber);
		    jf.add(phone);
		    jf.add(btnSubmit);
		    
		    jf.setVisible(true);
		    }

		    public static void main(String[] args) {
		        new Question2JDBC();
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String firstname = firstName.getText();
		        String lastname = lastName.getText();
		        String emailAddress = email.getText();
		        String phoneNum = phone.getText();

		        String insertQuery = "INSERT INTO customers (FirstName, LastName,Email,Phone) VALUES (?, ?,?,?)";

		        try (Connection connection = DriverManager.getConnection(url, username, password);
		                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

		               preparedStatement.setString(1, firstname);
		               preparedStatement.setString(2, lastname);
		               preparedStatement.setString(3, emailAddress);
		               preparedStatement.setString(4, phoneNum);

		               

		               // Execute the insert command
		               int rowsInserted = preparedStatement.executeUpdate();
		               if (rowsInserted > 0) {
		                   JOptionPane.showMessageDialog(null, "A new record was inserted successfully!");
		               }
		           } catch (SQLException ex) {
		               ex.printStackTrace();
		               JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		           }
		       }


	

}
