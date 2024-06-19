
package swingproject;

import javax.swing.*;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class login  implements ActionListener{
	JTextField userName;
	JPasswordField password;
	
	public login() {
		JFrame jf=new JFrame("Login Page");
		jf.setSize(300,200);
		jf.setLayout(new FlowLayout());
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(2,2));
//		p1.setSize(300,150);
		
		JLabel user=new JLabel("UserName");
//		user.setSize(100,40);
		
		
		userName=new JTextField();
		userName.setSize(100,40);
		
		JLabel pass=new JLabel("Password");
//		user.setSize(100,40);
		
		password=new JPasswordField();
		 password.setPreferredSize(new Dimension(100, 30));		
		
		p1.add(user);
		p1.add(userName);
		p1.add(pass);
		p1.add(password);
		
		
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout());
		
		JButton blogin=new JButton("Login");
		blogin.setSize(50,40);
		blogin.addActionListener(this);
		
		JButton cancel=new JButton("Cancel");
		cancel.setSize(50,40);
		cancel.addActionListener(this);

		JButton register=new JButton("Register");
		register.setSize(50,40);
		register.addActionListener(this);

		
		
		p2.add(blogin);
		p2.add(cancel);
		p2.add(register);
		
		jf.add(p1);
		jf.add(p2);
		jf.setVisible(true);
		
		

	}

	public static void main(String[] args) {
		new login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		String user=userName.getText().toString();
		String pass=password.getText().toString();
		if (e.getActionCommand()=="Login") {
			try {
				BufferedReader br=new BufferedReader(new FileReader("D://user.txt"));
				String username;
				String userpassword;
				String line =null;
				boolean b=false;
				line=br.readLine();
				while (line!=null) {
					String[] cred=line.split("\t");
					username=cred[0];
					userpassword=cred[1];
					if (username.equals(user) && userpassword.equals(pass)) {
						b=true;
						break;
					}
					line=br.readLine();
				}
				if (b) {
					JOptionPane.showMessageDialog(null,"Login Successfull","Current Status",JOptionPane.INFORMATION_MESSAGE);
					Dashboard d=new Dashboard();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Login Unsuccessfull","Curent Status",JOptionPane.WARNING_MESSAGE);
				}
				br.close();
			}
			catch(IOException f) {
				f.printStackTrace();
			}
		}
		else if (e.getActionCommand() == "Register") {
			try {
				BufferedWriter bw=new BufferedWriter(new FileWriter("D://user.txt",true));
				bw.write(user+ "\t" +pass);
				bw.write("\n");
				bw.close();
				JOptionPane.showMessageDialog(null,"Register Successfull","  Current Status ",JOptionPane.INFORMATION_MESSAGE );
			}
			catch(IOException g) {
				g.printStackTrace();
			}
		}
		else if (e.getActionCommand()=="Cancel") {
			userName.setText(null);
	        password.setText(null);
		}
	}
		
	
}
