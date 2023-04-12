package main;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
/** Method for drawing the score table
 * 
 * Currently this method throws errors.
 */
public class Table extends JFrame{    
	private JButton bGoBack = new JButton("Back");
    private static final long serialVersionUID = 1L;   
		JFrame f;    
	    Table(){    
	    f=new JFrame("Catan -- Scores");    
	    
	    f.getContentPane().add(bGoBack, BorderLayout.WEST);
	    bGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});
	    
	    String data[][]={ {"Laurens","1000000","2"},    
	                      {"Getalem","100","30"}};    
	    String column[]={"Player","Win","Total VP"};         
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.getContentPane().add(sp);         
	    f.setSize(300,400);    
	    f.setVisible(true);
    }
}
