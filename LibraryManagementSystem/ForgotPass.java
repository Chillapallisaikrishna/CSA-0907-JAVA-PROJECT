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

import LibraryManagementSystem.LoginForm;
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
import java.sql.ResultSet;
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
class Retrieve extends JFrame implements ActionListener 
{
	 JLabel uname,name,pass,ques,ans;
     JButton search,back,ret;
     JTextField jf,jf1,jf2,jf3,jf4;
     
    JPanel panel;
     Font f;
    
     JPanel contentPane;
    
     JLabel image;
     ImageIcon icon;
	public Retrieve()
	 {
		 setVisible(true);
		 setSize(600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("FORGOT PASSWORD");
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
		
		 pass=new JLabel("Security Question :");
		 contentPane.add(pass);
		 pass.setFont(f);
		 pass.setForeground(Color.BLACK);
		 pass.setBounds(100,150 , 400, 30);
		
		 ques=new JLabel("Answer :");
		 ques.setFont(f);
		 ques.setForeground(Color.BLACK);
		 contentPane.add(ques);
		 ques.setBounds(100,200 , 400, 30);
		
		 ans = new JLabel("Password :");
		 ans.setFont(f);
		 ans.setForeground(Color.BLACK);
		 contentPane.add(ans);
		 ans.setBounds(100,250,400,30);
		
		 
		 search=new JButton("Search");
		 contentPane.add( search);
		 search.setBounds(400,52, 80, 25);
		 search.addActionListener(this);
		 search.setBackground(new Color(128,0,0));
		 search.setForeground(Color.white);
		 search.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		
         back=new JButton("Back");
         contentPane.add(back);
 		 back.setBounds(200,320, 120, 30);
         back.addActionListener(this);
         back.setBackground(new Color(128,0,0));
		 back.setForeground(Color.white);
		 back.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		 
		 ret=new JButton("Retrieve");
         contentPane.add(ret);
 		 ret.setBounds(397,202,100, 25);
 		 ret.addActionListener(this);
 		 ret.setBackground(new Color(128,0,0));
 		 ret.setForeground(Color.white);
 		 ret.setBorder(new LineBorder(new Color(128,0,0), 2, true));
          
		 jf=new JTextField(5);
		 contentPane.add(jf);
		 jf.setBounds(240, 56, 150, 20);
		
		 jf1=new JTextField(5);
		 contentPane. add(jf1);
		 jf1.setBounds(240, 106, 200, 20);
		 jf1.setEditable(false);

		 jf2=new JTextField(5);
		 contentPane.add(jf2);
		 jf2.setBounds(240, 156, 200, 20);
		 jf2.setEditable(false);

		 
		 jf3=new JTextField(5);
		 contentPane.add(jf3);
    	 jf3.setBounds(240,206,150,20);
		
         jf4=new JTextField(5);
         contentPane.add(jf4);
		 jf4.setBounds(240, 256, 200, 20);
		 jf4.setEditable(false);


		 
		  panel = new JPanel();
			panel.setForeground(new Color(34, 139, 34));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0)), "Forgot-Password",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(165,42,42)));
			panel.setBounds(31, 20, 480, 400);
		        panel.setBackground(new Color(210,180,140));
		        contentPane.add(panel);
		     
         
         
         }

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
        try{
            conn con = new conn();
            if(ae.getSource() == search){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, jf.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    jf1.setText(rs.getString("name"));
                    jf2.setText(rs.getString("sec_q"));
		}

            }
            if(ae.getSource() == ret){
                String sql = "select * from account where sec_ans=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, jf3.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    	jf4.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == back){
                this.setVisible(false);
                form f=new form();
			
            }
        }catch(Exception e){
            
        }
    }

}

	
class ForgotPass
{
  public static void main(String[] args)

  {
	  SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
		
			Retrieve r= new Retrieve();
			
		}
	});
			  
	  
  }
}

