package alternative;

import javax.swing.*;

public class CoursesTab  extends JPanel{
	
	public CoursesTab() {
		JLabel courseList=new JLabel("Course List");
		
		String[] courses= {"Math","Science","History","Art","Physical Education"};
		
		JList list=new JList<>(courses);
		
		
		JScrollPane js=new JScrollPane(list);
		
		add(courseList);
		add(js);
	}

}
