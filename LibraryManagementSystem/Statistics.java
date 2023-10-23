package LibraryManagementSystem;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;
class Stat extends JFrame  {
    JLabel l1,l2,l3;
    private JScrollPane ScrollPanel_1,ScrollPanel_2;
    JTable t1,t2;
    
	JPanel contentPane,panel1,panel2;
	
    public void issueBook() {
	try {
            conn con =  new conn();
            String sql = "select * from issue";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            t1.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public void returnBook() {
        try {
            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            t2.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

	public Stat() {
		
		 setLayout(null);
		 //Setting the Frame
		 setVisible(true); //making frame visible
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing the frame properly
		 setSize(800,600);//setting Size: width and height of frame
		 setLocationRelativeTo(null);//Locating frame in the Center
		
		//ADDING A CONTAINER 
			contentPane=new JPanel();
			contentPane.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
	
			  //adding back label at the top 
			JLabel l3 = new JLabel("Back");
			l3.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				home1 home = new home1();
				//home.setVisible(true);
		            }
			});
			l3.setForeground(new Color(128,0,0));
			l3.setFont(new Font("Tahoma", Font.BOLD, 18));
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/close.png"));
		        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		        ImageIcon i3 = new ImageIcon(i2);
		        l3.setIcon(i3);
			l3.setBounds(600, 5, 96, 27);
			contentPane.add(l3);

			
		    ScrollPanel_1=new JScrollPane();
		    ScrollPanel_1.setBounds(40,51,708,200);
		    contentPane.add(ScrollPanel_1);
		    
		    t1=new JTable();
		    t1.setBackground(new Color(210,180,140));
		    t1.setForeground(Color.DARK_GRAY);
		    t1.setFont(new Font("Trebuhet MS",Font.BOLD,15));
		    ScrollPanel_1.setViewportView(t1);
		    
		    //ADDING Border to panel container
			panel1=new JPanel();
			panel1.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 2, true), "Issue Book Details",
					TitledBorder.LEADING, TitledBorder.TOP, null,  new Color(165,42,42)));
				    panel1.setBounds(28,30,730,230);
			panel1.setBackground(new Color(210,180,140));	    
		    contentPane.add(panel1);
            contentPane.setBackground(new Color(210,180,140));
		    
		    ScrollPanel_2=new JScrollPane();
		    ScrollPanel_2.setBounds(40,290,708,200);
		    contentPane.add(ScrollPanel_2);
		    
		    t2=new JTable();
		    t2.setBackground(new Color(210,180,140));
		    t2.setForeground(Color.DARK_GRAY);
		    t2.setFont(new Font("Trebuhet MS",Font.BOLD,15));
		    ScrollPanel_2.setViewportView(t2);
		    
		  //ADDING Border to panel container
			panel2=new JPanel();
			panel2.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 2, true), "Return Book Details",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(165,42,42)));
		    panel2.setBounds(28,270,730,230);
		    panel2.setBackground(new Color(210,180,140));
		    contentPane.add(panel2);
		    
		    issueBook();
			returnBook();
		    
		
	}
	}

public class Statistics {

 	public static void main(String [] args) {
   		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Stat obj=new Stat(); //creating Object;	
				
			}
		});
   	    
   	
      
	
	 
	
		
	}

}
