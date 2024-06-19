package alternative;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.event.*;
import javax.swing.*;

public class Question4JList {
	
	public static void main (String[] args) {
		
		JFrame jf=new JFrame("JList Demo ");
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		
		JPanel jp=new JPanel();
		jp.setLayout(new FlowLayout());
		String[] subject= {"Maths","Database","IT","AdvanceJava","Java","Finance","Operating System","Data Communication and Network"};
		JList jl=new JList<> (subject);
		
		 jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        jl.setVisibleRowCount(5);
		
		JScrollPane jsp=new JScrollPane(jl);
        jsp.setPreferredSize(new Dimension(120,90));

		
		JLabel lbl=new JLabel("Choose Subjects:");
		jl.addListSelectionListener(new ListSelectionListener() {
			 public void valueChanged(ListSelectionEvent e) {
	                int[] indices = jl.getSelectedIndices();
	                if (indices.length > 0) {
	                    StringBuilder selectedItems = new StringBuilder("Current Selection: ");
	                    for (int index : indices) {
	                        selectedItems.append(subject[index]).append(", ");
	                    }
	                    lbl.setText(selectedItems.substring(0, selectedItems.length() - 2));
	                } else {
	                    lbl.setText("Choose subjects");
	                }
	            }
			        });

		jf.add(jsp);
		jf.add(lbl);
		jf.setVisible(true);
		
		
	}

}
