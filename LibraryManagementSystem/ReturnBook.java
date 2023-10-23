package LibraryManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import LibraryManagementSystem.home;
import LibraryManagementSystem.conn;

class Return extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JButton b1,b2,b3;
	private JPanel panel;
	JDateChooser date;
	 
	private JPanel contentPane;

	  public void delete() {
	        try {
	            conn con = new conn();
	            String sql = "delete from issue where book_id=?";
	            PreparedStatement st = con.c.prepareStatement(sql);
	            st.setString(1, t1.getText());
	            int i = st.executeUpdate();
	            if (i > 0)
	                JOptionPane.showMessageDialog(null, "Book Returned");
	            else
	                JOptionPane.showMessageDialog(null, "error in Deleting");
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, e);
	            e.printStackTrace();
		}
	    }

	
	
	public	Return(){
	 //Setting the Frame
	setTitle("Return Book");
	 setVisible(true); //making frame visible
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing the frame properly
	 setSize(785,400);//setting Size: width and height of frame
	 setLocationRelativeTo(null);//Locating frame in the Center
	 
	 //content pane
	    contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(210,180,140));
//ADDING 
	 
	 //labels
	  l1=new JLabel("Book_id :");
      l1.setBounds(50,51,90,22);
      l1.setFont(new Font("Arial Black",Font.BOLD,12));
      l1.setForeground(Color.BLACK);
      contentPane.add(l1); 
      
      l2=new JLabel("Book :");
	  l2.setBounds(50,98,90,22);
	  l2.setFont(new Font("Arial Black",Font.BOLD,12));
      l2.setForeground(Color.BLACK);
	  contentPane.add(l2);
	   
	    l3=new JLabel("Course :");
		l3.setBounds(50,141,90,22);
		l3.setFont(new Font("Arial Black",Font.BOLD,12));
		l3.setForeground(Color.BLACK);
		contentPane.add(l3);
		
		l4=new JLabel("Date of Issue :");
		l4.setBounds(50,184,120,22);
		l4.setFont(new Font("Arial Black",Font.BOLD,12));
		l4.setForeground(Color.BLACK);
		setForeground(Color.BLACK);
		contentPane.add(l4);
		
		l5=new JLabel("Date of Return :");
		l5.setBounds(50,228,120,22);
		l5.setFont(new Font("Arial Black",Font.BOLD,12));
		l5.setForeground(Color.BLACK);
		contentPane.add(l5);
		
		l6=new JLabel("Student_id :");
	      l6.setBounds(410,55,90,22);
	      l6.setFont(new Font("Arial Black",Font.BOLD,12));
	      l6.setForeground(Color.BLACK);
	      contentPane.add(l6); 
	      
	      l7=new JLabel("Name :");
		  l7.setBounds(410,98,90,22);
		  l7.setFont(new Font("Arial Black",Font.BOLD,12));
	      l7.setForeground(Color.BLACK);
		  contentPane.add(l7);
		   
		    l7=new JLabel("Branch :");
			l7.setBounds(410,141,90,22);
			l7.setFont(new Font("Arial Black",Font.BOLD,12));
			l7.setForeground(Color.BLACK);
			contentPane.add(l7);
			
		//-------------ADDING TEXT FIELDS AND COMBO BOX------------
		
		//text field 1
		t1=new JTextField();
		t1.setBounds(192,55,180,22);
		t1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		contentPane.add(t1);
		
		//text field 2
		t2=new JTextField();
		t2.setBounds(192,98,180,22);
		t2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		t2.setEditable(false);
		contentPane.add(t2);
		
		//text field 3
		t3=new JTextField();
		t3.setBounds(192,141,180,22);
		t3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		t3.setEditable(false);
		contentPane.add(t3);
		
		//text field 4
		t4=new JTextField();
		t4.setBounds(192,184,180,22);
		t4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		t4.setEditable(false);
		contentPane.add(t4);
		
		//text field 5
		t5=new JTextField();
		t5.setBounds(542,54,80,22);
		t5.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		contentPane.add(t5);
		
		//text field 6
		t6=new JTextField();
		t6.setBounds(542,98,180,22);
		t6.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		t6.setEditable(false);
		contentPane.add(t6);
		
		//text field 7
		t7=new JTextField();
		t7.setBounds(542,141,180,22);
		t7.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		t7.setEditable(false);
		contentPane.add(t7);
	
		//Button
		//ADDING BUTTON B1 
		b1=new JButton("Search");
		b1.setBounds(632,51,90,28);
		b1.setBackground(new Color(128,0,0));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
	    b1.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		contentPane.add(b1);
		
		//Adding Button B2
		b2=new JButton("Return");
		b2.setBounds(472,205,90,32);
		b2.setBackground(new Color(128,0,0));
		b2.setForeground(Color.white);
	    b2.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		b2.addActionListener(this);
		contentPane.add(b2);

		//Adding Button B3
		b3=new JButton("Back");
		b3.setBounds(590,205,90,32);
		b3.setBackground(new Color(128,0,0));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
	    b3.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		contentPane.add(b3);
		

		//calendar 
		date=new JDateChooser();
		
		date.setBounds(192,228,180,22);
		date.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		contentPane.add(date);
		
		//ADDING Border to panel container
		panel=new JPanel();
	    panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0),1),"Return-Panel  ",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(165,42,42)));
	    panel.setBounds(25,20,720,300);
		panel.setBackground(new Color(210,180,140));
		panel.setForeground(Color.white);
	    contentPane.add(panel);

		
		

}
@Override
public void actionPerformed(ActionEvent e) {

/*	if(e.getSource()==b1)
	{
			
	}
	if(e.getSource()==b2)
	{
		this.dispose();
		JOptionPane.showMessageDialog(this,"Book Returned Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE );
		
	}
	
	if(e.getSource()==b3)
	{
		this.dispose();
		home1 h=new home1();
		
	}*/
    try{
        conn con = new conn();
        if(e.getSource() == b1){
            String sql = "select * from issue where student_id = ? and book_id =?";
	PreparedStatement st = con.c.prepareStatement(sql);
	st.setString(1, t5.getText());
	st.setString(2, t1.getText());
	ResultSet rs = st.executeQuery();
	
            while (rs.next()) {
                t2.setText(rs.getString("bname"));
                t6.setText(rs.getString("sname"));
                t3.setText(rs.getString("course"));
                t7.setText(rs.getString("branch"));
                t4.setText(rs.getString("dateOfIssue"));
                	}
          
	st.close();
	rs.close();
	
        }
        
        if(e.getSource() == b2){
            String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement st = con.c.prepareStatement(sql);
	st.setString(1, t1.getText());
	st.setString(2, t5.getText());
	st.setString(3, t2.getText());
	st.setString(4, t6.getText());
	st.setString(5, t3.getText());
	st.setString(6, t7.getText());
	st.setString(7, t4.getText());

	st.setString(8, ((JTextField) date.getDateEditor().getUiComponent()).getText());
	int i = st.executeUpdate();
	if (i > 0) {
                JOptionPane.showMessageDialog(null, "Processing..");
                delete();
	} else
                JOptionPane.showMessageDialog(null, "error");
	
        }
        if(e.getSource() == b3){
            this.setVisible(false);
	        home1 h=new home1();
		
        }
    }catch(Exception ex){
        
    }
}

	
}

public class ReturnBook {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			   public void run(){
				new Return().setVisible(true);	 //creating Object;	
				
			}
		});
	}

}
