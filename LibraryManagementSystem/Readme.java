package LibraryManagementSystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


class Readmee extends JFrame{

	private JLabel l1,l2,l3,l;
	private JTextArea t1;
	JPanel contentPane;
	
	public Readmee() {
		 setVisible(true);
		 setSize(700,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("READ_ME");
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setBackground(new Color(169, 169, 169));	
		 
		    contentPane = new JPanel();
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	   	    contentPane.setBackground(new Color(165,42,42));
	    
	        	   	    
	   	    
		    JLabel l1 = new JLabel("Library Management System");
	        l1.setForeground(new Color(165,42,42));
	        l1.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
	        l1.setBounds(60, 30, 701, 100);
	        contentPane.add(l1);
	        
	        	        
	        JLabel l2 = new JLabel("Developed By : Juvita And Meenal");
	        l2.setForeground(Color.black);
	        l2.setFont(new Font("Times New Roman", Font.ITALIC, 35));
	        l2.setBounds(100, 120, 701, 100);
	        contentPane.add(l2);
	        

	        
		    t1=new JTextArea("Library Management System is a project which aims in developing \na computerized "
		    		+ "system to maintain all the daily work of a library.\nThe system helps both students "
		    		+ "and library manager to keep a \nconstant track of all the books available in the library."
		    		+ "It allows both\nthe admin and the student to search for the desired book. ");
		    t1.setBounds(50,250,600,120);
		    t1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
	        t1.setBackground(new Color(210,180,140));
		   t1.setForeground(new Color(120,0,0));
	        contentPane.add(t1);
	        
	      
	        
	        JPanel panel = new JPanel();
	        panel.setBorder(new TitledBorder(new LineBorder(new Color(210,180,140), 2),null, TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(199,21,133)));
	        panel.setBounds(20, 30,650,400);
	        panel.setBackground(new Color(210,180,140));
	        contentPane.add(panel);
            
	}
}
class Readme
{
  public static void main(String[] args)

  {
	  
   SwingUtilities.invokeLater(new Runnable() {
	
	@Override
	public void run() {
	
		Readmee r= new Readmee();	
	}
});
	
  }	  
	  
  }


