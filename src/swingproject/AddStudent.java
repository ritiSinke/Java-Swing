package swingproject;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class AddStudent extends JPanel {
	
	JTextField firstName;
	JTextField lastName;
	JRadioButton male;
	JRadioButton female;
	JComboBox program;
	JComboBox section;
	
	public AddStudent() {
		
		
		GridLayout gl=new GridLayout(6,2);
		setLayout(gl);
		
		JLabel first=new JLabel("First Name:");
		firstName=new JTextField();
		
		JLabel last=new JLabel("First Name:");
		lastName=new JTextField();
		
		JLabel gender=new JLabel("Gender");
		
		 male=new JRadioButton("Male");
		 female=new JRadioButton("Female");
		 JPanel jpa=new JPanel(new FlowLayout());
		 
		 jpa.add(male);
		 jpa.add(female);
		
		ButtonGroup jbg=new ButtonGroup();
		jbg.add(female);
		jbg.add(male);
		
		
		JLabel p=new JLabel("Program");
		
		
		String[] sec={"BBA","BBA-BI","BCIS","BBA-TT"};
		program=new JComboBox(sec);
		
		
		JLabel sect=new JLabel("Section");
		
		section = new JComboBox();	
		section.addItem("Jasper");
		section.addItem("Jasmin");
		section.addItem("Icon");
		section.addItem("Image");
		section.addItem("Ideal");
		section.addItem("helm");
		
		
	
		program.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED) {
					if(e.getItem()=="BCIS") {
						section.removeAllItems();
						section.addItem("Grit/Garnet");
						section.addItem("Fusion");
						section.addItem("Fourier");
						section.addItem("Enum/Efika");
						section.addItem("Devine/Deism");
						section.addItem("Maxthon");	
					}else if(e.getItem()=="BBA-BI") {
						section.removeAllItems();
						section.addItem("Trend");
						section.addItem("Transit");
						section.addItem("Forex");
						section.addItem("Fiscal");
					}else if(e.getItem()=="BBA") {
						section.removeAllItems();
						section.addItem("Jasper");
						section.addItem("Jasmin");
						section.addItem("Icon");
						section.addItem("Image");
						section.addItem("Ideal");
						section.addItem("helm");
					}
					
				}
				
			}
		});

		
		JButton add=new JButton("Add Student");
		
		add(first);
		add(firstName);
		add(last);
		add(lastName);
		add(gender);
		add(jpa);
		add(p);
		add(program);
		add(sect);
		add(section);
		add(add);
	}


}
