package LibraryManagementSystem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import LibraryManagementSystem.conn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
class CreateAccount extends JFrame implements ActionListener 
{
	 JLabel uname,name,pass,ques,ans;
     JButton create,back;
     JTextField jf,jf1,jf2;
     JPasswordField jp;
    JPanel panel;
     Font f;
    
     JPanel contentPane;
     JComboBox cb;
     JLabel image;
     ImageIcon icon;
	public CreateAccount()
	 {
		 setVisible(true);
		 setSize(600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("CREATE ACCOUNT");
		 setLocationRelativeTo(null);
		 setLayout(null);
		 f=new Font("Arial Black",Font.BOLD,12);
		
		 contentPane = new JPanel();
	     
		 setContentPane(contentPane);
		 contentPane.setBackground(new Color(210,180,140));
		 contentPane.setLayout(null);

 
		 
		 uname=new JLabel("Username :");
		 uname.setFont(f);
		 uname.setForeground(Color.BLACK);
		 contentPane.add(uname);
		 uname.setBounds(100,50,400, 30);
		
		 name=new JLabel("Name :");
		 contentPane.add(name);
	    name.setFont(f);
		name.setForeground(Color.BLACK);
		name.setBounds(100,100, 400, 30);
		
		 pass=new JLabel("Password :");
		 contentPane.add(pass);
		 pass.setFont(f);
		 pass.setForeground(Color.BLACK);
		 pass.setBounds(100,150 , 400, 30);
		
		 ques=new JLabel("Security Question :");
		 ques.setFont(f);
		 ques.setForeground(Color.BLACK);
		 contentPane.add(ques);
		 ques.setBounds(100,200 , 400, 30);
		
		 ans = new JLabel("Answer :");
		 ans.setFont(f);
		 ans.setForeground(Color.BLACK);
		 contentPane.add(ans);
		 ans.setBounds(100,250,400,30);
		
		 
		 create=new JButton("Create");
		 contentPane.add(create);
		 create.setBounds(130,350, 120, 30);
          create.addActionListener(this);
          create.setBackground(new Color(128,0,0));
          create.setBorder(new LineBorder(new Color(128,0,0), 2, true));
 		 create.setForeground(Color.white);
 		 
		
         back=new JButton("Back");
         contentPane.add(back);
 		 back.setBounds(300,350, 120, 30);
         back.addActionListener(this);
         back.setBackground(new Color(128,0,0));
         back.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		 back.setForeground(Color.white);
		 
          
          
		 jf=new JTextField(5);
		 contentPane.add(jf);
		 jf.setBounds(240, 56, 200, 20);
		
		 jf1=new JTextField(5);
		 contentPane. add(jf1);
		 jf1.setBounds(240, 106, 200, 20);
		 
		 jp=new JPasswordField(5);
		 contentPane.add(jp);
		 jp.setBounds(240, 156, 200, 20);
		 
		 cb=new JComboBox();
		 cb.addItem("Your Nickname?");
		 cb.addItem("Who is your childhood superhero?");
     	 cb.addItem("Name of your favourite teacher?");
		 cb.addItem("What is your favourite food?");
		 contentPane.add(cb);
         cb.setBounds(240,206,200,20);
		
         jf2=new JTextField(5);
         contentPane.add(jf2);
		 jf2.setBounds(240, 256, 200, 20);
		
		  panel = new JPanel();
			panel.setForeground(new Color(34, 139, 34));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0)), "Create-Account",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(165,42,42)));
			panel.setBounds(31, 20, 476, 400);
		        panel.setBackground(new Color(210,180,140));
		        contentPane.add(panel);
		     
         
         
         }

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try {
			
	     conn con = new conn();
		if(e.getSource()==create)
		{
            //this.dispose(); 
			String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, jf.getText());
	        st.setString(2, jf1.getText());
			st.setString(3,jp.getText());
			st.setString(4, (String) cb.getSelectedItem());
			st.setString(5, jf2.getText());

			int i = st.executeUpdate();
			if (i > 0){
	                    JOptionPane.showMessageDialog(null, "successfully Created");
	                }

	               jf.setText("");
	               jf1.setText("");
			       jp.setText("");
			       jf2.setText("");
	            }

		//	JOptionPane.showMessageDialog(this,"ACCOUNT CREATED SUCCESSFULLY","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
    //        form f=new form();
		
			
	
		if(e.getSource()==back)
		{
			
			this.dispose();
            form f=new form(); 
            
			}
		}
		catch(Exception ex)
		{
            
        } 				
			} 
 			
} 
	

class SignUp
{
  public static void main(String[] args)

  {
	  SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
		
			CreateAccount ca= new CreateAccount();
			
		}
	});
			  
	  
  }
}

