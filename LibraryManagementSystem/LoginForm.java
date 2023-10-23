package LibraryManagementSystem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;

import LibraryManagementSystem.Loading;
import LibraryManagementSystem.conn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
class form extends JFrame implements ActionListener
{
	
     JLabel text,l1;
     JLabel text1;
     JLabel text2;
     JButton log,sign,forg;
     JTextField jf;
     JPasswordField jp;
     Font f;
     JLabel image;
     ImageIcon icon;
     JPanel panel;
	public form()
	 {
		 setVisible(true);
		 setSize(1000, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("LOGIN FRAME");
		 setBackground(new Color(176, 224, 230));
		 setLocationRelativeTo(null);
		 setLayout(null);
		 f=new Font("Arial Black",Font.BOLD,12);
		 setBackground(new Color(169, 169, 169));	
	        
			
	    panel = new JPanel();
		panel.setBackground(new Color(210,180,140));
		setContentPane(panel);
		panel.setLayout(null);
		 panel.setBounds(0,0,800,400);
		 
	
		 JLabel l3 = new JLabel("WELCOME");
	     l3.setForeground(new Color(128,0,0));
	     l3.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 40));
	     l3.setBounds(630, 40,600, 55);
	     panel.add(l3);
	    
		 
		text = new JLabel("Trouble in Login?");
		 text.setFont(f);
		 text.setForeground(Color.red);
		 panel.add(text);
		 text.setBounds(550,305,400,30);
		 
		 text1=new JLabel("UserName:");
		 text1.setFont(f);
		 panel.add(text1);
		
		 text1.setBounds(550,120,400, 30);
		
		 text2=new JLabel("Password:");
		 text2.setFont(f);
			
		 panel.add(text2);
		 text2.setBounds(550,170, 400, 30);
		
		 log=new JButton("Login");
		panel.add(log);
		 log.setBounds(630,240, 120, 30);
         log.addActionListener(this);
		 log.setBackground(new Color(128,0,0));
		 log.setForeground(Color.WHITE);
	     log.setBorder(new LineBorder(new Color(128,0,0), 2, true));		 
         
         sign=new JButton("SignUp");
		 panel.add(sign);
		 sign.setBounds(800,240, 120, 30);
         sign.addActionListener(this);
         sign.setBackground(new Color(128,0,0));
		 sign.setForeground(Color.WHITE);
		 sign.setBorder(new LineBorder(new Color(128,0,0), 2, true));
         
         forg=new JButton("Forgot Password ");
		 panel.add(forg);
		 forg.setBounds(690,305, 150, 30);
         forg.addActionListener(this);
         forg.setBackground(new Color(128,0,0));
		 forg.setForeground(Color.WHITE);
		 forg.setBorder(new LineBorder(new Color(128,0,0), 2, true));
         
		 jf=new JTextField(5);
		 add(jf);
		 jf.setBounds(660, 126, 200, 20);
		 jp=new JPasswordField(5);
		 add(jp);
		 jp.setBounds(660, 176, 200, 20);
		 
	        JLabel l2 = new JLabel("");
	        l2.setVerticalAlignment(SwingConstants.TOP);
	        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/specs.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(550, 550,Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        l2 = new JLabel(i3);
	        l2.setBounds(0, 0, 500,500);
	        panel.add(l2);

		 
		 
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==log)
		{
			//this.dispose();
			  Boolean status = false;
				try {
		                    conn con = new conn();
		                    String sql = "select * from account where username=? and password=?";
		                    PreparedStatement st = con.c.prepareStatement(sql);

		                    st.setString(1,jf.getText());
		                    st.setString(2, jp.getText());

		                    ResultSet rs = st.executeQuery();
		                    if (rs.next()) {
		                 
		                       JOptionPane.showMessageDialog(this,"LOGIN SUCCESSFUL","MESSAGE",JOptionPane.INFORMATION_MESSAGE );
		                       this.setVisible(false);
		                       home1 h =new home1();
		                    } else
					JOptionPane.showMessageDialog(null, "Invalid Login...!.");
		                       
				} catch (Exception e2) {
		                    e2.printStackTrace();
				}
 
		}
		if(e.getSource()==sign)
		{
			
			this.dispose();
             CreateAccount ca=new CreateAccount() ;   
        	}
		if(e.getSource()==forg)
		{
			
			this.dispose();
          
            Retrieve r=new Retrieve();
		
		}
	}
	

}
class LoginForm
{
  public static void main(String[] args)

  {
	  
   SwingUtilities.invokeLater(new Runnable() {
	
	@Override
	public void run() {
	
		form f= new form();	
	}
});
	
	  
	  
  }

}
