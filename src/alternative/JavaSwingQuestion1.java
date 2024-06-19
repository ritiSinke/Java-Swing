package alternative;

import javax.swing.*;

public class JavaSwingQuestion1 {
	
	public JavaSwingQuestion1() {
		JFrame jf=new JFrame("Student Management System");
		jf.setSize(500,500);
		
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Student Information", new StudentInformationTab());
		jtp.addTab("Courses", new CoursesTab());
		jtp.addTab("Grades", new GradesTab());
		
		jf.add(jtp);
		jf.setVisible(true);
	}

public static void main (String[] args) {
	new JavaSwingQuestion1();
}
}
