package alternative;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Question3InsertandUpdate {
	
	String url="jdbc:mysql://localhost:3306/college";
	String username="root";
	String password="root";
	public Question3InsertandUpdate() {
		
		try {
			String insert="Insert into student(name,address,gender,program)"
					+ " values('Sam','Kathmandu','male','BCIS')";
				
			String update="Update student set program='BBA'where s_id=1";
			 Connection connection=DriverManager.getConnection(url,username,password);
			 PreparedStatement statement=connection.prepareStatement(insert);
			 PreparedStatement updatestmt=connection.prepareStatement(update);

		 int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"A new student record was inserted successfully!");
            
            
            int rowsUpdated=updatestmt.executeUpdate();
            if (rowsUpdated>0) {
                JOptionPane.showMessageDialog(null, "Program updated successfully to BBA!");

            }
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
		
		
	}
	public static void main(String[] args) {
		new Question3InsertandUpdate();
	}

}
