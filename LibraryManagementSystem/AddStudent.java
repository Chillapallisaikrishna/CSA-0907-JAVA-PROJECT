package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import LibraryManagementSystem.home;
import LibraryManagementSystem.conn;

//class AddBooks 
class AddStudent1 extends JFrame implements ActionListener {
	
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JTextField t1,t2,t3;
	JPanel contentPane;
	private JPanel panel;
	private JButton b1,b2;
	JComboBox comboBox1,comboBox2,comboBox3,comboBox4;
    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(10000 + 1));
    }

	
    //----------------CONSTRUCTOR-------------------
	AddStudent1(){
		
		setLayout(null);
		 setVisible(true); //making frame visible
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing the frame properly
		 setSize(570,500);//setting Size: width and height of frame
		 setLocationRelativeTo(null);//Locating frame in the Center
		
		
		//ADDING A CONTAINER 
				contentPane=new JPanel();
				contentPane.setBackground(Color.LIGHT_GRAY);
				setContentPane(contentPane);
				contentPane.setLayout(null);
				contentPane.setBackground(new Color(210,180,140));
        //ADDING LABEL:Book_id
		       l1=new JLabel("Student_id");
		       l1.setBounds(68,58,400,30);
		       l1.setFont(new Font("Arial Black",Font.BOLD,12));
	           l1.setForeground(Color.black);
		       contentPane.add(l1);
		
	    //ADDING LABEL:Name
				l2=new JLabel("Name");
				l2.setBounds(68,97,400,30);
				l2.setFont(new Font("Arial Black",Font.BOLD,12));
				l2.setForeground(Color.black);
				contentPane.add(l2);
				
	   //ADDING LABEL:ISBN
				l3=new JLabel("Father's Name");
				l3.setBounds(68,138,400,30);
				l3.setFont(new Font("Arial Black",Font.BOLD,14));
				l3.setForeground(Color.black);
				contentPane.add(l3);
				
	  //ADDING LABEL:PUBLISHER
				l4=new JLabel("Course");
				l4.setBounds(68,178,400,30);
				l4.setFont(new Font("Arial Black",Font.BOLD,14));
				l4.setForeground(Color.black);
				contentPane.add(l4);
				
	 //ADDING LABEL:EDITION
				l5=new JLabel("branch");
				l5.setBounds(68,217,400,30);
				l5.setFont(new Font("Arial Black",Font.BOLD,14));
				l5.setForeground(Color.black);
				contentPane.add(l5);
				
    //ADDING LABEL:PRICE
				l6=new JLabel("Year");
				l6.setBounds(68,258,400,30);
				l6.setFont(new Font("Arial Black",Font.BOLD,14));
				l6.setForeground(Color.black);
				contentPane.add(l6);
				
	 //ADDING LABEL:PAGES
				l7=new JLabel("Semester");
				l7.setBounds(68,300,400,30);
				l7.setFont(new Font("Arial Black",Font.BOLD,14));
				l7.setForeground(Color.black);
				contentPane.add(l7);
				
	//-------------ADDING TEXT FIELDS AND COMBO BOX------------
				
				//text field 1
				t1=new JTextField();
				t1.setBounds(200,65,220,20);
				t1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t1);
			    t1.setEditable(false);	
				//text field 2
				t2=new JTextField();
				t2.setBounds(200,105,220,20);
				t2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t2);
				
				//text field 3
				t3=new JTextField();
				t3.setBounds(200,145,220,20);
				t3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t3);
				
				
				//Combo BOX 1
				comboBox1=new JComboBox();
				comboBox1.setModel(new DefaultComboBoxModel(new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
				comboBox1.setBounds(200,185,220,20);
				contentPane.add(comboBox1);
				
				//Combo BOX 2
				comboBox2=new JComboBox();
				comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
				comboBox2.setBounds(200,225,220,20);
				contentPane.add(comboBox2);
			
				//Combo BOX 3
				comboBox3=new JComboBox();
				comboBox3.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Third", "Four" }));
				comboBox3.setBounds(200,265,220,22);
				contentPane.add(comboBox3);
			
				//Combo BOX 4
				comboBox4=new JComboBox();
				comboBox4.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
				comboBox4.setBounds(200,305,220,22);
				contentPane.add(comboBox4);
			
				//ADDING BUTTON B1 AND B2 
				b1=new JButton("ADD");
				b2=new JButton("BACK");
                b1.addActionListener(this);	
				b1.setBounds(140,370,100,28);
				b2.setBounds(280,370,100,28);
				b2.addActionListener(this);
				contentPane.add(b1);
				contentPane.add(b2);
				b1.setBackground(new Color(128,0,0));
				b1.setForeground(Color.white);
				b2.setBackground(new Color(128,0,0));
				b2.setForeground(Color.white);
				b1.setBorder(new LineBorder(new Color(128,0,0), 2, true));
				b2.setBorder(new LineBorder(new Color(128,0,0), 2, true));
				
				
  //----------------TEXT FIELD COMPLETED----------------------------	
						
	   //ADDING Border to panel container
     	panel=new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0),1),"Add Student  ",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(165,42,42)));
		panel.setBounds(40,30, 476, 400);
		panel.setBackground(new Color(210,180,140));
		contentPane.add(panel);
		random();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			try
			{
                conn con = new conn();
        String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, (String) comboBox1.getSelectedItem());
		st.setString(5, (String) comboBox2.getSelectedItem());
		st.setString(6, (String) comboBox3.getSelectedItem());
		st.setString(7, (String) comboBox4.getSelectedItem());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    //this.setVisible(false);
                   // AddStudent1 a=new AddStudent1();
                    //home1 h=new home1();
                    t1.setText("");
	                t2.setText("");
	                t3.setText("");
	          //      t4.setText("");
	            //    t5.setText("");
	              //  t6.setText("");
	                random();
			  
		}
		else
                    JOptionPane.showMessageDialog(null, "error");
                }
			catch(Exception ae)
			{
                    ae.printStackTrace();
                }

		}
		if(e.getSource()==b2)
		{
			this.dispose();
			home1 h=new home1();
			
		}
		
		
	}
}
	
	//------------Main Class--------------
		class AddStudent{
	   	public static void main(String [] args) {
	   		SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					AddStudent1 object=new AddStudent1(); //creating Object;	
					
				}
			});
	   	    
	   	
	      
		
		 
		
			
		}
	}


