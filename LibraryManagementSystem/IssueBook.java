package LibraryManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import LibraryManagementSystem.home;
import LibraryManagementSystem.conn;

//class AddBooks 
class Issue extends JFrame implements ActionListener {
	// for block Issue Book
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	private JTextField t1, t2, t3, t4, t5, t6, t7;
	JPanel contentPane;
	private JPanel panel;
	private JButton b1, b2, b3;
	private JDateChooser date;
	// For block Student Details
	private JLabel ll1, ll2, ll3, ll4, ll5, ll6, ll7;
	private JTextField tt1, tt2, tt3, tt4, tt5, tt6, tt7;
	JPanel contentPane1;
	private JPanel panel1;
	private JButton bb1;
//	JComboBox comboBox1;

	// ----------------CONSTRUCTOR-------------------
	public Issue() {

		// Setting the Frame
		setVisible(true); // making frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closing the frame properly
		setSize(800, 450);// setting Size: width and height of frame
		setLocationRelativeTo(null);// Locating frame in the Center
		// setLocation(100,40);

		setLayout(null);

		/*
		 * ---------------------------------------- First Block ------>ISSUE BOOK
		 * ----------------------------------------
		 *
		 */
		// ADDING A CONTAINER
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(210,180,140));
		// ADDING LABEL:Book_id
		l1 = new JLabel("Book_id:");
		l1.setBounds(40, 51, 90, 22);
		l1.setFont(new Font("Arial Black", Font.BOLD, 12));
		l1.setForeground(Color.black);
		contentPane.add(l1);

		// ADDING LABEL:Name
		l2 = new JLabel("Name:");
		l2.setBounds(40, 84, 90, 22);
		l2.setFont(new Font("Arial Black", Font.BOLD, 12));
		l2.setForeground(Color.black);
		contentPane.add(l2);

		// ADDING LABEL:ISBN
		l3 = new JLabel("ISBN:");
		l3.setBounds(40, 117, 90, 22);
		l3.setFont(new Font("Arial Black", Font.BOLD, 12));
		l3.setForeground(Color.black);
		contentPane.add(l3);

		// ADDING LABEL:PUBLISHER
		l4 = new JLabel("Publisher:");
		l4.setBounds(40, 150, 90, 22);
		l4.setFont(new Font("Arial Black", Font.BOLD, 12));
		l4.setForeground(Color.black);
		contentPane.add(l4);

		// ADDING LABEL:EDITION
		l5 = new JLabel("Edition:");
		l5.setBounds(40, 184, 90, 22);
		l5.setFont(new Font("Arial Black", Font.BOLD, 12));
		l5.setForeground(Color.black);
		contentPane.add(l5);

		// ADDING LABEL:PRICE
		l6 = new JLabel("Price:");
		l6.setBounds(40, 220, 90, 22);
		l6.setFont(new Font("Arial Black", Font.BOLD, 12));
		l6.setForeground(Color.black);
		contentPane.add(l6);

		// ADDING LABEL:PAGES
		l7 = new JLabel("Pages:");
		l7.setBounds(40, 255, 90, 22);
		l7.setFont(new Font("Arial Black", Font.BOLD, 12));
		l7.setForeground(Color.black);
		contentPane.add(l7);

		l8 = new JLabel("Date of Issue:");
		l8.setBounds(35, 320, 140, 22);
		l8.setFont(new Font("Arial Black", Font.BOLD, 12));
		l8.setForeground(Color.black);
		add(l8);

		// -------------ADDING TEXT FIELDS AND COMBO BOX------------

		// text field 1
		t1 = new JTextField();
		t1.setBounds(125, 51, 100, 22);
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(t1);

		// text field 2
		t2 = new JTextField();
		t2.setBounds(125, 84, 220, 22);
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setEditable(false);
		contentPane.add(t2);
		

		// text field 3
		t3 = new JTextField();
		t3.setBounds(125, 117, 220, 22);
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	    t3.setEditable(false);
		contentPane.add(t3);

		// text field 4
		t4 = new JTextField();
		t4.setBounds(125, 150, 220, 22);
		t4.setEditable(false);
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(t4);

		
		t7 = new JTextField();
		t7.setBounds(125, 186, 220, 20);
	    t7.setEditable(false);
	    t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(t7);

		// text field 5
		t5 = new JTextField();
		t5.setBounds(125, 220, 220, 22);
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setEditable(false);
		contentPane.add(t5);

		// text field 6
		t6 = new JTextField();
		t6.setBounds(125, 255, 220, 22);
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setEditable(false);
		contentPane.add(t6);

		// calendar
		date = new JDateChooser();

		date.setBounds(150, 320, 160, 22);
       // date.setBorder(new LineBorder(new Color(0,0,0),1,true));
		//	date.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        date.setForeground(new Color(105,105,105));
		contentPane.add(date);

		// ADDING BUTTON B3
		b1 = new JButton("Issue");
		b1.setBounds(60, 360, 100, 28);
		b1.setBackground(new Color(128,0,0));
		b1.setForeground(Color.white);
	    b1.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		b1.addActionListener(this);
		add(b1);

		b2 = new JButton("Back");
		b2.setBounds(190, 360, 100, 28);
		b2.setBackground(new Color(128,0,0));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
	    b2.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		contentPane.add(b2);

		b3 = new JButton("Search");
		b3.setBounds(240, 47, 100, 28);
		b3.setBackground(new Color(128,0,0));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
	    b3.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		contentPane.add(b3);

		// ----------------TEXT FIELD COMPLETED----------------------------

		// ADDING Border to panel container
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 1), "Issue BOOK  ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(165,42,42)));
		panel.setBounds(20, 20, 340, 280);
		contentPane.add(panel);
		panel.setBackground(new Color(210,180,140));

		/*
		 * ---------------------------------------- Second Block ------>Student Details
		 * ----------------------------------------
		 *
		 */
		// ADDING A CONTAINER

//ADDING LABEL:Book_id
		ll1 = new JLabel("Student_id :");
		ll1.setBounds(390, 51, 90, 22);
		ll1.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll1.setForeground(Color.black);
		contentPane.add(ll1);

//ADDING LABEL:Name
		ll2 = new JLabel("Name:");
		ll2.setBounds(390, 84, 90, 22);
		ll2.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll2.setForeground(Color.black);
		contentPane.add(ll2);

//ADDING LABEL:ISBN
		ll3 = new JLabel("Father Name:");
		ll3.setBounds(390, 117, 120, 22);
		ll3.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll3.setForeground(Color.black);
		contentPane.add(ll3);

//ADDING LABEL:PUBLISHER
		ll4 = new JLabel("Course:");
		ll4.setBounds(390, 150, 90, 22);
		ll4.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll4.setForeground(Color.black);
		contentPane.add(ll4);

//ADDING LABEL:EDITION
		ll5 = new JLabel("Branch:");
		ll5.setBounds(390, 184, 90, 22);
		ll5.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll5.setForeground(Color.black);
		contentPane.add(ll5);

//ADDING LABEL:PRICE
		ll6 = new JLabel("Year:");
		ll6.setBounds(390, 220, 90, 22);
		ll6.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll6.setForeground(Color.black);
		contentPane.add(ll6);

//ADDING LABEL:PAGES
		ll7 = new JLabel("Semester:");
		ll7.setBounds(390, 255, 90, 22);
		ll7.setFont(new Font("Tahoma", Font.BOLD, 14));
		ll7.setForeground(Color.black);
		contentPane.add(ll7);

//-------------ADDING TEXT FIELDS AND COMBO BOX------------

		// text field 1
		tt1 = new JTextField();
		tt1.setBounds(500, 51, 80, 22);
		tt1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(tt1);

		// text field 2
		tt2 = new JTextField();
		tt2.setBounds(500, 84, 220, 22);
		tt2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt2.setEditable(false);
		contentPane.add(tt2);

		// text field 3
		tt3 = new JTextField();
		tt3.setBounds(500, 117, 220, 22);
		tt3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt3.setEditable(false);
		contentPane.add(tt3);

		// text field 4
		tt4 = new JTextField();
		tt4.setBounds(500, 150, 220, 22);
		tt4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt4.setEditable(false);
		contentPane.add(tt4);

		// text field 7
		tt7 = new JTextField();
		tt7.setBounds(500, 185, 220, 22);
		tt7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt7.setEditable(false);
		contentPane.add(tt7);

		// text field 5
		tt5 = new JTextField();
		tt5.setBounds(500, 220, 220, 22);
		tt5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt5.setEditable(false);
		contentPane.add(tt5);

		// text field 6
		tt6 = new JTextField();
		tt6.setBounds(500, 255, 220, 22);
		tt6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tt6.setEditable(false);
		contentPane.add(tt6);

		// ADDING BUTTON B1
		bb1 = new JButton("Search");
		bb1.setBounds(590, 47, 90, 28);
		bb1.setBackground(new Color(128,0,0));
		bb1.setForeground(Color.white);
		bb1.addActionListener(this);
		bb1.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
		contentPane.add(bb1);

//----------------TEXT FIELD COMPLETED----------------------------	

//ADDING Border to panel container
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 1), "Student Details  ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(165,42,42)));
		panel1.setBounds(365, 20, 370, 370);
		panel1.setBackground(new Color(210,180,140));
		contentPane.add(panel1);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		try {
			conn con = new conn();
			if (ae.getSource() == b3) {
				String sql = "select * from book where book_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("isbn"));
					t4.setText(rs.getString("publisher"));
					t5.setText(rs.getString("edition"));
					t6.setText(rs.getString("price"));
					t7.setText(rs.getString("pages"));
				}
				st.close();
				rs.close();

			}
			if (ae.getSource() == bb1) {
				String sql = "select * from student where student_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, tt1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					tt2.setText(rs.getString("name"));
					tt3.setText(rs.getString("father"));
					tt4.setText(rs.getString("course"));
					tt5.setText(rs.getString("branch"));
					tt6.setText(rs.getString("year"));
					tt7.setText(rs.getString("semester"));
				}
				st.close();
				rs.close();

			}
			if (ae.getSource() == b1) {
				try {
					String sql = "insert into issue(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, tt1.getText());
					st.setString(3, t2.getText());
					st.setString(4, tt2.getText());
					st.setString(5, tt4.getText());
					st.setString(6, tt5.getText());
					st.setString(7, ((JTextField) date.getDateEditor().getUiComponent()).getText());
					int i = st.executeUpdate();
					if (i > 0)
					{
				    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
	                tt1.setText("");
	                tt2.setText("");
	                tt3.setText("");
	                tt4.setText("");
	                tt5.setText("");
	                tt6.setText("");
	                tt7.setText("");
	            	
	                t1.setText("");
	                t2.setText("");
	                t3.setText("");
	                t4.setText("");
	                t5.setText("");
	                t6.setText("");
	                t7.setText("");
	            	
					}
					else
						JOptionPane.showMessageDialog(null, "error");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (ae.getSource() == b2) {
				this.setVisible(false);
				home1 h= new home1();

			}

			con.c.close();
		} catch (Exception ex) {

		}
	}
}

// ------------Main Class--------------
class IssueBook {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				Issue object = new Issue(); // creating Object;

			}
		});

	}
}
